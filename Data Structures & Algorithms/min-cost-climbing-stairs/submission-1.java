class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0,cost,dp),minCost(1,cost,dp));
    }

    int minCost(int i,int[] cost,int dp[]){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.min(minCost(i+1,cost,dp),minCost(i+2,cost,dp))+cost[i];
    }
}
