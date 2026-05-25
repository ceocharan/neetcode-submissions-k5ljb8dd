class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=oddPali(i,s) + evenPali(i,s);
        }
        return res;
    }

    int oddPali(int i,String s){
        int p1=i,p2=i,no=0;
        while(p1>=0 && p2<s.length()){
            if(s.charAt(p1)==s.charAt(p2)){
                no++; p1--;
            p2++;
            }
            else{
                break;
            }

        }
        return no;
        
    }
    
    int evenPali(int i,String s){
        int p1=i,p2=i+1,res=0;
        while(p1>=0 && p2<s.length()){
            if(s.charAt(p1)==s.charAt(p2)){
                res++;
                 p1--;
            p2++;
            }
            else{
                break;
            }
           
        }
        return res;
    }
}
