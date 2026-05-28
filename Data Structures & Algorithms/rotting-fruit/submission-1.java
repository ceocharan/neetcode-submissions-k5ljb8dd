class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};
        int[][] vis=new int[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    vis[i][j]=1;
                }
                if(grid[i][j]==1){
                    c++;
                }
            }
        }
        if(c==0){
            return 0;
        }
        int n,x,y;
        int k[];
        int res=0;
        while(!q.isEmpty()){
            n=q.size();
            res++;
            System.out.println(q);
            for(int i=0;i<n;i++){
                k=q.poll();
                x=k[0];
                y=k[1];
                for(int j[]:dirs){
                    int x1=x+j[0];
                    int y1=y+j[1];
                    if(x1>=0 && x1<grid.length && y1>=0 && y1<grid[0].length && vis[x1][y1]==0){
                        vis[x1][y1]=1;

                        if(grid[x1][y1]==1){
                            q.add(new int[]{x1,y1});
                            c--;
                        }
                    }
                }
                System.out.println(c);
                if(c==0){
                    return res;
                }
            }
        }
        return -1;
    }
}
