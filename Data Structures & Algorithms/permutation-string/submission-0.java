class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            m1.put(s1.charAt(i),m1.getOrDefault(s1.charAt(i),0)+1);
        }

        int i=0,l=0;
        for(int j=0;j<s2.length();j++){
            if(l==s1.length()){
                if(m2.getOrDefault(s2.charAt(i),0)==1){
                    m2.remove(s2.charAt(i));
                    
                }
                else{
                    m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)-1);
                }
                l--;
                i++;

            }
            l++;
            m2.put(s2.charAt(j),m2.getOrDefault(s2.charAt(j),0)+1);
            if(m1.equals(m2)){
                return true;
            }
        }
        return false;
        
    }
}
