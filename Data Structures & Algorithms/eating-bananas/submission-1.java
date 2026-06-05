class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int hi=0;
        for(int i:piles){
            hi=Math.max(hi,i);
        }
        int l=1;
        int res=hi;
        while(l<=hi){
            int mid=l+(hi-l)/2;
            if(prb(mid,piles,h)){
                res=Math.min(res,mid);
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;

    }
    boolean prb(int v,int[] piles,int h){
        int res=0;
        for(int i:piles){
            if(i%v==0){
                res+=i/v;
            }
            else{
                res+=(i/v)+1;
            }
        }
        return res<=h;
    }
}
