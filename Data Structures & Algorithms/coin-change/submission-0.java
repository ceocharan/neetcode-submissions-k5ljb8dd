class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int res=rec(0,amount,coins,dp);
        return res==(int)1e9 ? -1 : res;
    }

    int rec(int i,int amount,int[] coins,int dp[][]){
        if(amount==0){
            return 0;
        }

        if(i>=coins.length || amount<0){
            return (int)1e9;
        } 
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
       
        int np=rec(i+1,amount,coins,dp);
        int p=(int)1e9;
        if(amount>=coins[i]){
            p=1+rec(i,amount-coins[i],coins,dp);
        }
        return dp[i][amount]=Math.min(p,np);
    }
}
