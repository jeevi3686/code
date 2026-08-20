class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int n = arr.length;

        int maxsum = arr[0];
        int minsum = arr[0];
        int res = Math.abs(arr[0]);
        for(int i=1;i<n;i++){
            maxsum = Math.max(arr[i],maxsum+arr[i]);
            minsum = Math.min(arr[i],minsum+arr[i]);

            res = Math.max(res,Math.max(maxsum,Math.abs(minsum)));

        }
        return res;

        
    }
}