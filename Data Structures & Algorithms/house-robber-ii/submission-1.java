class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp1[]=new int[nums.length];
        int dp2[]=new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(sum(0,nums.length-1,nums,dp1),sum(1,nums.length,nums,dp2));
    }

    int sum(int i,int j,int[] nums,int dp[]){
        if(i>=j){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int v1=sum(i+1,j,nums,dp);
        int v2=nums[i]+sum(i+2,j,nums,dp);
        return dp[i]=Math.max(v1,v2);
    }
}
