class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st=new HashSet<>();
        while(n>1){
            if(st.contains(n)){
                return false;
            }
            st.add(n);
            int z=n,s=0;
            while(z>0){
                s+=Math.pow(z%10,2);
                z=z/10;
            }
            n=s;
        }
        return true;
    }
}
