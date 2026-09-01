class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int mdiff = Integer.MAX_VALUE;
        int res=0;
        int sum=0;

        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right = n-1;
            

            while(left<right){
                sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(sum-target);
                if(diff<mdiff){
                    mdiff=Math.min(diff,mdiff);
                    res=sum;
                
                }
                if(sum==target){
                    return sum;

                }
                else if(sum>target){
                    right--;
                }
                else{
                    left++;
                }

            }


        }
        return res;
        
    }
}