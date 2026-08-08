class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;


        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            int low = i+1;
            int high = n-1;

            while(low<high){
                
                int sum = nums[i]+nums[low]+nums[high];

                int madiff = Math.abs(sum - target);

                if(madiff<diff){
                    diff = madiff;
                    ans = sum;
                }

                if(sum == target){
                    return sum;
                }
                else if(sum>target){
                    high--;
                }
                else{
                    low++;
                }

            }

        }
        return ans;

    }
}