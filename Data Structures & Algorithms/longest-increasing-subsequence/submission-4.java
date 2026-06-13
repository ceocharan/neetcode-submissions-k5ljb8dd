class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return dp(0,nums,-1,dp);
    }

    int dp(int i,int[] nums,int prev,int[][] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }
        int p=0,np=0;
        if(prev==-1 || nums[prev]<nums[i]){
            p=1+dp(i+1,nums,i,dp);
        }
        np=dp(i+1,nums,prev,dp);
        return dp[i][prev+1]=Math.max(p,np);
    }
}
