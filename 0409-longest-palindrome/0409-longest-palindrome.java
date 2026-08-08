class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean odd = false;

        int length = 0;

        for(int a : map.values()){
            if(a%2==0){
                length+=a;
            }
            else{
                length = length+a-1;
                odd =true;
            }
        }

        if(odd){
            return length+1;
        }
        return length;
    }
}