class Solution {
    public int characterReplacement(String s, int k) {
        int res=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> m=new HashMap<>();
            int l=0;
            int b=0;
            for(int j=i;j<s.length();j++){
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                l++;
                b=Math.max(b,m.get(s.charAt(j)));
                if(l-b<=k){
                    res=Math.max(l,res);
                }
            }
            
        }
        return res;
    }
}
