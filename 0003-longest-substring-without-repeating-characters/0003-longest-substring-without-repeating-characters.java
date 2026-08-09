class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res =0;

        int low =0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int high =0;high<n;high++){
            char c = s.charAt(high);
            map.put(c,map.getOrDefault(c,0)+1);


            int k = high -low+1;

            while(map.size()<k){
                char l = s.charAt(low);

                map.put(l,map.get(l)-1);

                if(map.get(l)==0){
                    map.remove(l);
                }
                low++;
                k = high-low+1;
            }

            res = Math.max(res,k);


        }
        return res;
    }
}