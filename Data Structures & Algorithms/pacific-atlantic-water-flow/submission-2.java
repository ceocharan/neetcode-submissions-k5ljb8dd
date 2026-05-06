class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        int[][] vis1=new int[n][m],vis2=new int[n][m];
        for(int i=0;i<m;i++){
            rec(0,i,n,m,heights,vis1,-1,-1);
            rec(n-1,i,n,m,heights,vis2,-1,-1);
        }
        for(int i=0;i<n;i++){
            rec(i,0,n,m,heights,vis1,-1,-1);
            rec(i,m-1,n,m,heights,vis2,-1,-1);
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis1[i][j]==1 && vis2[i][j]==1){
                    res.add(List.of(i,j));
                }
            }
        }
        return res;
    }

    void rec(int i,int j,int n,int m,int[][] heights,int[][] vis,int p1,int p2){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j]==1 || (p1>=0 && p2>=0 && !(heights[i][j]>=heights[p1][p2]))){
            return;
        }
        vis[i][j]=1;
        rec(i+1,j,n,m,heights,vis,i,j);
        rec(i-1,j,n,m,heights,vis,i,j);
        rec(i,j+1,n,m,heights,vis,i,j);
        rec(i,j-1,n,m,heights,vis,i,j);

    }
}
