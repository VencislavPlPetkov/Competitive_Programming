/**
 * Unique Paths
 * 
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in  * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot  * is trying to reach the bottom-right corner of the grid (marked 'Finish' in the  * diagram below).
 * 
 * How many possible unique paths are there?
 * 
 *  Example 1:
 * 
 * Input: m = 3, n = 7
 * Output: 28
 * 
 * Example 2:
 * 
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation:
 * From the top-left corner, there are a total of 3 ways to reach the  * bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 * 
 * Example 3:
 * 
 * Input: m = 7, n = 3
 * Output: 28
 * 
 * Example 4:
 * 
 * Input: m = 3, n = 3
 * Output: 6
 * 
 */

class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] d = new int[m][n];
        int rows = m;
        int cols = n;
        
        // only one way to reach first column boxes
        // fill first column with 1
        for(int row = 0; row < d.length; row++){
            d[row][0] = 1;
        }
        
        // fill first row with 1
        for(int col = 0; col < d[0].length; col++){
            d[0][col] = 1;
        }       
        
        
        for(int row = 1; row < rows; ++row){
            for(int col = 1; col < cols; ++col){
                
                d[row][col] = d[row-1][col] + d[row][col-1];
                
            }
        }
        
        
        return d[rows-1][cols-1];
    }
}




