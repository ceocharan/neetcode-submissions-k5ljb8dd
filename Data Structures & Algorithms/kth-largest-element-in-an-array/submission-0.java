class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer n[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i]=nums[i];
        }
        Arrays.sort(n,(a,b)->b-a);
        return n[k-1];
    }
}
