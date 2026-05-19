class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(),st=new StringBuilder(),res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                st=new StringBuilder(sb);
                st.reverse();
                if(sb.toString().equals(st.toString()) && res.length()<sb.length()){
                    res=new StringBuilder(sb);
                }
            }
        }
        return res.toString();
        
    }
}

