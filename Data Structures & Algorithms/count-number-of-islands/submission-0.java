class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(grid[i][j]=='1'){
                    res++;
                    rec(i,j,grid,m,n);
                    System.out.println(Arrays.deepToString(grid));
                }
            }
        }
        return res;
    }

    void rec(int i,int j,char[][] grid,int m,int n){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        rec(i+1,j,grid,m,n);
        rec(i-1,j,grid,m,n);
        rec(i,j+1,grid,m,n);
        rec(i,j-1,grid,m,n);
    }
}
