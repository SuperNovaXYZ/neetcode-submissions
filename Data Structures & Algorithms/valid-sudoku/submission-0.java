class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<board.length; row++){
            
            for(int col=0; col<board[row].length; col++){
                char position = board[row][col];
                    if(position== '.'){
                        continue;
                    }
                for (int otherCol=col +1; otherCol<board[row].length; otherCol++){

                        if(position== board[row][otherCol]){
                            return false;
                        }

                }

                for(int otherRow= row+1; otherRow <board.length;otherRow++){
                    char position2= board[otherRow][col];
                    if(position== position2){
                        return false;
                    }
                }

                int boxrowStart= (row/3) * 3;
                int boxcolStart = (col/3) *3;

                for(int boxRow=boxrowStart; boxRow<boxrowStart+3; boxRow++){
                    
                    for(int boxCol=boxcolStart; boxCol<boxcolStart+3; boxCol++){
                        if(boxRow == row && boxCol== col){
                            continue;
                        }
                        char currboxed= board[boxRow][boxCol];
                        if(position == currboxed){
                            return false;
                        }
                    }
                    }
            }
        }

        
return true;
}
}
