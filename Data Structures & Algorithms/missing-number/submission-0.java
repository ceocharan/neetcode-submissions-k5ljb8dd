class Solution {
    public int missingNumber(int[] nums) {
        int z=0;
        for(int i=0;i<=nums.length;i++){
            z^=i;
        }
        for(int i:nums){
            z^=i;
        }
        return z;
    }
}
