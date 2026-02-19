class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int rows = 0;
        int cols = matrix[0].length-1;
        while(rows<matrix.length && cols>=0){
            if(matrix[rows][cols]==target){
                return true;
            }
            else if(matrix[rows][cols]>target){
                //move left
                cols--;
            }
            else {
                rows++;
            }
           
        }
        return false;
       
    }
}
