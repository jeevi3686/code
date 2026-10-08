class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int onedelete=0;
        int nodelete=arr[0];
        int res=arr[0];

        for(int i=1;i<n;i++){
            int v1 = arr[i];
            int v2 = nodelete+arr[i];
            int v3 = onedelete+arr[i];
            int v4= nodelete;

            
            nodelete = Math.max(v1,v2);
            onedelete= Math.max(v3,v4);
            res = Math.max(res,Math.max(nodelete,onedelete));

        }
        return res;
        
    }
}