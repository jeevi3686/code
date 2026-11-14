class Solution {
    public long hours(int arr[],int guess){
        long count=0;
        for(int n: arr){
            count+=(n+(long)guess-1)/guess;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low=1;
        int high=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        }

        while(low<=high){
            int guess=(low+high)/2;

            long time = hours(piles,guess);

            if(time>h){
                low=guess+1;
            }
            else{
                res=guess;
                high=guess-1;
            }


        }
        return res;
    }
}