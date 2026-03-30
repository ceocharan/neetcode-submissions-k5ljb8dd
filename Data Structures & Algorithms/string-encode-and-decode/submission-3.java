class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String st:strs){
            sb.append(st.length()+"#"+st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        int i=0;
        StringBuilder sb=new StringBuilder();
        List<String> res=new ArrayList<>();
        while(i<str.length()){
            if(str.charAt(i)=='#'){
                int n=Integer.parseInt(sb.toString());
                i++;
                StringBuilder st=new StringBuilder();
                while(n>0 && i<str.length()){
                    st.append(str.charAt(i));
                    n--;
                    i++;
                }
                if(i<str.length())
                    sb=new StringBuilder(str.charAt(i));
                res.add(st.toString());
            }
            else{
                sb.append(str.charAt(i));
                i++;
            }
        }
        return res;
    }
}
