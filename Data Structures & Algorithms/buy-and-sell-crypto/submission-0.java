class Solution {
    public int maxProfit(int[] prices) {
        int m=prices[0];
        int res=0;
        for(int i:prices){
            m=Math.min(m,i);
            res=Math.max(res,i-m);
        }
        return res;
    }
}
