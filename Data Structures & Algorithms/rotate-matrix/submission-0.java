class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int i1=0,j=matrix[0].length-1;
            while(i1<j){
                int t=matrix[i][i1];
                matrix[i][i1]=matrix[i][j];
                matrix[i][j]=t;
                i1++;
                j--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=-1){
            int i1=i,j1=0,i2=matrix.length-1,j2=j;
            while(j1<j && i2>i){
                int t=matrix[i1][j1];
                matrix[i1][j1]=matrix[i2][j2];
                matrix[i2][j2]=t;
                j1++;
                i2--;
            }
            i++;
            j--;
        }
    }
}
