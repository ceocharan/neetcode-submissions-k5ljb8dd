class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(0,nums,dp);
    }

    int rec(int i,int[] nums,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int p=nums[i]+rec(i+2,nums,dp);
        int np=rec(i+1,nums,dp);
        return dp[i]=Math.max(p,np);
    }
}
