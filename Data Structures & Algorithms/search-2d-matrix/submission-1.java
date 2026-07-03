class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int rows= matrix.length;
        int cols= matrix[0].length;
        int right= (rows*cols -1);
        
        if(matrix==null || matrix.length==0) return false;


        while(left<=right){
            int middle= (left + right) /2;
            int row = middle / cols;
            int col= middle % cols;
            int middleNumber = matrix[row][col];

            if(target== middleNumber){
                return true;
            }

            if (target < middleNumber){
                right= middle -1;
            }else{
                left= middle+1;
            }

        }
        

        return false;
    }
}
