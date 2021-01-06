
/**
 * Valid Sudoku
 * 
 * Determine if a 9 x 9 Sudoku board is valid. Only the  * filled cells need to be validated according to the  * following rules:
 * 
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without  * repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must  * contain the digits 1-9 without repetition.
 * Note:
 * 
 * A Sudoku board (partially filled) could be valid but is  * not necessarily solvable.
 * Only the filled cells need to be validated according to  * the mentioned rules.
 *  
 * 
 * Example 1:
 * 
 * 
 * Input: board = 
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * Example 2:
 * 
 * Input: board = 
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the  * top left corner being modified to 8. Since there are two  * 8's in the top left 3x3 sub-box, it is invalid.
*/






class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++){
            
            HashSet<Character> row = new HashSet<Character>(); 
            HashSet<Character> column = new HashSet<Character>(); 
            HashSet<Character> box = new HashSet<Character>(); 
            
            for(int j = 0; j < board[i].length; j++){
                
                if(board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                
                if(board[j][i] != '.' && !column.add(board[j][i]))
                    return false;
                
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !box.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
                
            }
            
        }
        
       return true; 
    }
}