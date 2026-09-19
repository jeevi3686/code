class Solution {
    public int[][] insert(int[][] intervals, int[] interval) {
        List<int[]> res = new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        boolean insert =false;

        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            if(start>=interval[0] && insert==false){
                res.add(new int[]{interval[0],interval[1]});
                insert=true;
            }
            res.add(new int[]{intervals[i][0],intervals[i][1]});
        }
        if(insert ==false){
            res.add(new int[]{interval[0],interval[1]});
        }
        
        int arr[][]=res.toArray(new int[res.size()][]);
        int N=arr.length;

        List<int[]>ress = new ArrayList<>();

        int start1 = arr[0][0];
        int end1=arr[0][1];

        for(int i=1;i<N;i++){
            int s = arr[i][0];
            int e =arr[i][1];
            if(end1>=s){
                start1=start1;
                end1 = Math.max(end1,e);
                continue;
            }
            ress.add(new int[]{start1,end1});
            start1=s;
            end1=e;


        }
        ress.add(new int[]{start1,end1});

        return ress.toArray(new int[ress.size()][]);

        
        
    }
}