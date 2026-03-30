class Solution {
    public int longestConsecutive(int[] nums) {
        //nums=[2,20,4,10,3,4,5]
        //mp={2:1,2-0}
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int res=0;
        int l=0;
        for(int i:nums){
            if(!st.contains(i-1)){
                l=0;
                while(st.contains(i)){
                    i+=1;
                    l++;
                }
                res=Math.max(res,l);
            }
        }
        return res;

    }
}
