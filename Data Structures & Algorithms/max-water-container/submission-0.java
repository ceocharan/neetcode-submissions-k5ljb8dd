class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        for(int i=0;i<heights.length;i++){
            int l=0;
            for(int j=i+1;j<heights.length;j++){
                l++;
                res=Math.max(res,Math.min(heights[i],heights[j])*l);
            }
        }
        return res;
    }
}
