class Solution {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        for(int i=0;i<nums.length;i++){
            int s=1;
            for(int j=i;j<nums.length;j++){
                s*=nums[j];
                res=Math.max(res,s);
            }
            
        }
        return res;

    }
}
