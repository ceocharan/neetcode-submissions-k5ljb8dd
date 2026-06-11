class Solution {
    public int findJudge(int n, int[][] trust) {
        int in[]=new int[n+1];
        int ou[]=new int[n+1];
        for(int i[]:trust){
            in[i[1]]++;
            ou[i[0]]++;
        }
        int res=0;
        for(int i=0;i<n+1;i++){
            if(ou[i]==0 && in[i]==n-1){
                return i;
            }
        }
        return -1;
        
    }
}