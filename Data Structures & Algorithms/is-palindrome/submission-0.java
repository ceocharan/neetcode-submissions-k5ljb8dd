class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int p1=0,p2=s.length()-1;
        while(p1<p2){
            if(!isAlphaNumeric(s.charAt(p1))){
                p1++;
                continue;
            }
            if(!isAlphaNumeric(s.charAt(p2))){
                p2--;
                continue;

            }
            if(s.charAt(p1)!=s.charAt(p2)){
                System.out.println(s.charAt(p1)+" "+s.charAt(p2));
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

    boolean isAlphaNumeric(char c){
        return (c>='0' && c<='9') || (c>='a' && c<='z') || (c>='A' && c<='Z');
    }
}
