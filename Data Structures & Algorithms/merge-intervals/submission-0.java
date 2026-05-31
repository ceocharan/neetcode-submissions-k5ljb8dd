class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        int x=intervals[0][0],y=intervals[0][1];
        int j=1;
        List<List<Integer>> l=new ArrayList<>();
        int v=0;
        while(j<intervals.length){
            if(y>=intervals[j][0]){
                y=Math.max(y,intervals[j][1]);
            }
            else{
                l.add(List.of(x,y));
                x=intervals[j][0];
                y=intervals[j][1];
            }
            j++;
        }
       
        l.add(List.of(x,y));
        int res[][]=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            for(int t=0;t<2;t++){
                res[i][t]=l.get(i).get(t);
            }
        }
        return res;
    }
}
