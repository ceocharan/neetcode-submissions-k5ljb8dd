class Solution {
    public int[] plusOne(int[] digits) {
        int c=1;
        List<Integer> l=new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--){
            int s=digits[i]+c;
            if(s>9){
                l.add(s%10);
                s=s/10;
                c=s;
            }
            else{
                l.add(s);
                c=0;
            }
        }
        if(c>0){
            l.add(c);
        }
        System.out.println(l);
        int res[]=new int[l.size()];
        int j=0;
        for(int i=l.size()-1;i>=0;i--){
            res[j++]=l.get(i);
        }
        return res;
    }
}
