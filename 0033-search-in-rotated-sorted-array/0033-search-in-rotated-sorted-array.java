class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>nums[n-1]  && target<=nums[n-1]){ //mid is in part1 and target is in part2   means we have to move right
                low=mid+1;
            }
            else if(nums[mid]<nums[n-1]  && target>nums[n-1]){  // mid is  in part2  and target is in  part1  means we have to move left
                high=mid-1;
            }

            // if both mid and  target is in same parts  than it is the normal binary search
            else if(nums[mid]<target){ 
                low=mid+1;   
            }else{ 
                high=mid-1;
            }
        }
        return -1;
    }
    
}