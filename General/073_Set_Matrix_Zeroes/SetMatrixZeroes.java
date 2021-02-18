
/**
 * Set Matrix Zeroes
 * 
 * Given an m x n matrix. If an element is 0, set its entire row and column to 0.  * Do it in-place.
 * 
 * Follow up:
 * 
 * A straight forward solution using O(mn) space is probably a bad idea.
 * A simple improvement uses O(m + n) space, but still not the best solution.
 * Could you devise a constant space solution?
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Example 2:
 * 
 * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */



class Solution {
    public void setZeroes(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0) return;
        
        boolean setFirstRowToZeroes = false;
        boolean setFirstColumnToZeroes = false;
        
        // check if first column needs to be set to zeroes
        for(int row = 0; row < matrix.length; row++){
            if(matrix[row][0] == 0){
                setFirstColumnToZeroes = true;
                break;
            }
        }
        
        
        // check if first row needs to be set to zeroes
        for(int column = 0; column < matrix[0].length; column++){
            if(matrix[0][column] == 0){
                setFirstRowToZeroes = true;
                break;
            }
        }
        
        
        // mark columns and rows to be set to zero
        for(int row = 1; row < matrix.length; row ++){
            for(int column = 1; column < matrix[0].length; column++){
                
                if( matrix[row][column] == 0){
                   matrix[0][column] = 0;
                   matrix[row][0] = 0;
                }
                
            }
        }
        

        // make rows zero
        for(int row=1;row<matrix.length;row++){
            if(matrix[row][0]==0){
                for(int col=1;col<matrix[0].length;col++){
                    matrix[row][col]=0;
                }
            }
        }

        // make columns zero
        for(int col=1;col<matrix[0].length;col++){
            if(matrix[0][col]==0){
                for(int row=1;row<matrix.length;row++){
                    matrix[row][col]=0;
                }
            }
        }

        // zero out first row (if needed)
        if(setFirstRowToZeroes){
            for(int col=0;col<matrix[0].length;col++){
                matrix[0][col]=0;
            }
        }

        // zero out first column (if needed)
        if(setFirstColumnToZeroes){
            for(int row=0;row<matrix.length;row++){
                matrix[row][0]=0;
            }
        }

        
        
    }
}








