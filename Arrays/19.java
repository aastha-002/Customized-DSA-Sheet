class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int right=n-1;
        int left=0;
        ArrayList <Integer> arr=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){            //to right
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){       //to bottom
                arr.add(matrix[i][right]);   
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){      //to left
                    arr.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){      //to top
                    arr.add(matrix[i][left]);
                }
            }
            left++;
        }
                
        return arr;
        
    }
}
