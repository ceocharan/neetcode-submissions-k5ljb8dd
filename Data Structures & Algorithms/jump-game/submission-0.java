class Solution {
    public boolean canJump(int[] nums) {
        return rec(0,nums);
    }

    boolean rec(int i,int[] nums){
        if(i==nums.length-1){
            return true;
        }

        if(i>=nums.length){
            return false;
        }

        for(int j=1;j<=nums[i];j++){
            if(rec(i+j,nums)){
                return true;
            }
        }
        return false;
    }
}
