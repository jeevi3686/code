class Solution {
    class Pair{
        char ch;
        int count;

        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(!st.isEmpty() && st.peek().ch==ch){
                st.peek().count++;
            }
            else{
                st.push(new Pair(ch,1));
            }
            if(st.peek().count ==k){
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            Pair p = st.pop();
            for(int i=0;i<p.count;i++){
                sb.append(p.ch);
            }
        }
        return sb.reverse().toString();

    }
}