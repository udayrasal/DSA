class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr[][]=new int[m][n];
        int arr1[][]=new int[][]{};
        int count=0;
        if(m*n!=original.length){
            return arr1;
        }else{

        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                arr[i][j]=original[count];
                count++;
            }
        }
        }
    return arr;
    }
}