class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        rec(0,nums,target,new ArrayList<>(),res);
        return res;
    }

    void rec(int i,int[] nums,int target,List<Integer> l,List<List<Integer>> res){
        if(i>=nums.length){
            if(target==0){
                res.add(new ArrayList<>(l));
            }
            return;
        }
        rec(i+1,nums,target,l,res);
        if(target>=nums[i]){
            l.add(nums[i]);
            rec(i,nums,target-nums[i],l,res);
            l.remove(l.size()-1);
        }
    }
}
