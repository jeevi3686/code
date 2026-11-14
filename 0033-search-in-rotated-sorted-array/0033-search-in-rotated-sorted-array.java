class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res1=-1;
        int res=-1;
        
        while(low<=high){
            int guess=(low+high)/2;

            if(nums[guess]>nums[nums.length-1]){
                low=guess+1;
            }
            else{
                res1=guess;
                high=guess-1;

            }
        }
        low=0;
        int h1 = res1-1;
        while(low<=h1){
            int mid =(low+h1)/2;
            if(nums[mid]==target){
                res=mid;
            }
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                h1=mid-1;
            }

        }
        low=res1;
        int h2 = nums.length-1;
        while(low<=h2){
            int mid =(low+h2)/2;
            if(nums[mid]==target){
                res=mid;
            }
            if(nums[mid]<target){
                low=mid+1;
            }
            else{
                h2=mid-1;
            }

        }
        return res;
        
    }
}