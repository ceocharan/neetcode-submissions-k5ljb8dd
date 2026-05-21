class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);
        System.out.println(Arrays.deepToString(intervals));
        int res=0,k=1;
        int i=intervals[0][0],j=intervals[0][1];
        while(k<intervals.length){
            if(j>intervals[k][0]){
                res++;
            }
            else{
                i=intervals[k][0];
                j=intervals[k][1];
            }
            k++;
        }
        return res;
    }
}
