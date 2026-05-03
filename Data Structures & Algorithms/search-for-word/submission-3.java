class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        int vis[][]=new int[board.length][board[0].length];
        boolean res=false;
        for(int i=0;i<m;i++){
            res|=rec(0,i,n,m,board,word,new StringBuilder(),vis);
            res|=rec(n-1,i,n,m,board,word,new StringBuilder(),vis);
        }
        for(int i=0;i<n;i++){
            res|=rec(i,0,n,m,board,word,new StringBuilder(),vis);
            res|=rec(i,m-1,n,m,board,word,new StringBuilder(),vis);
        }
        return res;
    }

    boolean rec(int i,int j,int n,int m,char[][] board,String word,StringBuilder sb,int[][] vis){
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j]==1){
            if(sb.toString().contains(word)){
                return true;
            }
            return false;
        }
        vis[i][j]=1;
        sb.append(board[i][j]);
        boolean b=rec(i,j+1,n,m,board,word,sb,vis);
        b|=rec(i,j-1,n,m,board,word,sb,vis);
        b|=rec(i+1,j,n,m,board,word,sb,vis);
        b|=rec(i-1,j,n,m,board,word,sb,vis);
        sb.deleteCharAt(sb.length()-1);
        vis[i][j]=0;
        return b;

    }
}
