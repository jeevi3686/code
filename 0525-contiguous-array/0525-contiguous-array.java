class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int countzero = 0;
        int countone =0;
        int ans = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countzero++;
            }
            else{
                countone++;
            }

            int diff = countzero-countone;
            if(diff ==0){
                ans = Math.max(ans,i+1);
            }
            else{
                if(!map.containsKey(diff)){
                    map.put(diff,i);
                }
                else{
                    int ind = map.get(diff);
                    int a = i-ind;
                    ans = Math.max(ans,a);
                }
            }


        }
        return ans;
        
    }
}