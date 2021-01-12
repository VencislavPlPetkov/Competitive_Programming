
/**
 * Sudoku Solver
 * 
 * Write a program to solve a Sudoku puzzle by filling the empty cells. 
 */



class Solution {
    public void solveSudoku(char[][] board) {
        
        if(board == null || board.length == 0)
            return;
        
        solve(board);
        
    }
    
    public boolean solve(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
            
            for(int j = 0; j < board[i].length; j++){
                
                if(board[i][j] == '.'){
                    
                    for(char c = '1'; c <= '9'; c++){
                        
                        if(isValid(board, i, j, (char)c)){
                            board[i][j] = (char)c;
                            
                            if(solve(board)){
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        } 
                    }
       
                    return false;
                    
                }
                
            }
            
        }        
        
        return true;
    }
    
    public boolean isValid(char[][] board, int row, int column, char c){
        
        for(int i = 0; i < 9; i++){
            
            if(board[row][i] != '.' && board[row][i] == c)
                return false;
            
            if(board[i][column] != '.' && board[i][column] == c)
                return false;
            
            if(board[3*(row/3)+i/3][3*(column/3)+i%3] != '.' && board[3*(row/3)+i/3][3*(column/3)+i%3] == c)
                return false;
            
        }
        
        return true;
    }
}







