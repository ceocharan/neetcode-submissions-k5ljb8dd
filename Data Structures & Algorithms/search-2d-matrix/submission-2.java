class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0,h=m*n;
        while(l<=h){
            int mid=l+(h-l)/2;
            System.out.println(mid);
            int i=mid/n;
            int j=mid%n;
            if(i>=m){
                break;
            }
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}
