class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return dp(0,0,text1,text2,dp);
    }

    int dp(int i,int j,String tx1,String tx2,int dp[][]){
        if(i>=tx1.length() || j>=tx2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int v1=0,v2=0;
        if(tx1.charAt(i)==tx2.charAt(j)){
            v1=1+dp(i+1,j+1,tx1,tx2,dp);
            return dp[i][j]=v1;
        }
        else{
            v2=Math.max(dp(i+1,j,tx1,tx2,dp),dp(i,j+1,tx1,tx2,dp));
            return dp[i][j]=v2;
        }
    }
}
