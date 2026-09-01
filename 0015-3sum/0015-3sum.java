class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<n-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i+1;
            int right = n-1;
            int find = -1*nums[i];
            
            while(left<right){
                int sum = nums[left]+nums[right];
                
                if(sum==find){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    // Skip duplicate left values
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }
                    
                    
                }
                else if(sum>find){
                    right--;
                }
                else{
                    left++;
                }
            }
            
        }
        return list;
    }
}