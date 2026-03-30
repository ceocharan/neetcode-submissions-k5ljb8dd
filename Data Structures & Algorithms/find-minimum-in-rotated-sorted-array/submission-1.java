class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,res=Integer.MAX_VALUE;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]<nums[h]){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return nums[l];
    }
}
