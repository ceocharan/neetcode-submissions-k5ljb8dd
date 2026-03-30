class Solution {
    public int[] productExceptSelf(int[] nums) {
        int f=0;
        int res=1;
        for(int i:nums){
            if(i==0){
                f++;
            }
            else{
                res*=i;
            }
        }
        int r[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && f==1){
                r[i]=res;
            }
            else if(nums[i]==0 && f>=1){
                r[i]=0;
            }
            else{
                if(f>0){
                    r[i]=0;
                }
                else{
                    r[i]=res/nums[i];
                }
            }
        }
        return r;
    }
}  
