class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tcount = new HashMap<>();
        Map<Character,Integer> scount = new HashMap<>();
        int v=0,no=0,ind=0;
        StringBuilder sb=new StringBuilder(),res=new StringBuilder();
        for(int i=0;i<t.length();i++){
            tcount.put(t.charAt(i),tcount.getOrDefault(t.charAt(i),0)+1);
        }
        no=tcount.size();
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            if(tcount.containsKey(s.charAt(i))){
                scount.put(s.charAt(i),scount.getOrDefault(s.charAt(i),0)+1);
                if(scount.get(s.charAt(i))==tcount.get(s.charAt(i))){
                    v++;
                }
            }
            if(v==no){

                if(sb.length()<res.length() || res.length()==0){
                    res=new StringBuilder(sb);
                }

                while(v==no && ind<=i){

                    if(sb.length()>0)
                        sb.deleteCharAt(0);
                    
                    if(scount.containsKey(s.charAt(ind))){
                        scount.put(s.charAt(ind),scount.get(s.charAt(ind))-1);
                        if(scount.get(s.charAt(ind))<tcount.get(s.charAt(ind))){
                            v--;
                        }
                    }
                    if(v==no && (sb.length()<res.length() || res.length()==0)){
                        res=new StringBuilder(sb);
                    }

                    ind++;
                }
                
            }
        }
        return res.toString();
    }
}
