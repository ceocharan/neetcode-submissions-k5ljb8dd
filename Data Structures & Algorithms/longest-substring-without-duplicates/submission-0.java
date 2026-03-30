class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int j=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(j++));
            }
            st.add(s.charAt(i));
            res=Math.max(st.size(),res);
        }
        return res;
    }
}
