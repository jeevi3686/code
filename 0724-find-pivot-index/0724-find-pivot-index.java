class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totsum = 0;
        for(int num : nums){
            totsum+=num;
        }

        int leftsum = 0;
        for(int i=0;i<n;i++){
            int rightsum = totsum-leftsum-nums[i];

            if(leftsum == rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}