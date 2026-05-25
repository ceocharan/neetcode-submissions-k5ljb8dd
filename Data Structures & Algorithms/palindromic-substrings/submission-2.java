class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=oddPali(i,i,s) + oddPali(i,i+1,s);
        }
        return res;
    }

    int oddPali(int i,int j,String s){
        int p1=i,p2=j,no=0;
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
}
