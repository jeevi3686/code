class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int res[] = new int[n];

        int low =0;
        int high=n-1;
        int pos = high;

        while(low<=high){
            if(Math.abs(nums[low])>=Math.abs(nums[high])){
                res[pos]=nums[low]*nums[low];
                low++;

            }
            else{
                res[pos] = nums[high]*nums[high];
                high--;
            }
            pos--;

        }
        return res;
    }
}