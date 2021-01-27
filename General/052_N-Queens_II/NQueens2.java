
/**
 * N-Queens 2
 * 
 * The n-queens puzzle is the problem of placing n queens on  * an n x n chessboard such that no two queens attack each  * other.
 * 
 * Given an integer n, return the number of distinct  * solutions to the n-queens puzzle.
 * 
 *  
 * Example 1:
 * 
 * Input: n = 4
 * Output: 2
 * Explanation: There are two distinct solutions to the  * 4-queens puzzle as shown.
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: 1
 */





class Solution {
    int result = 0;
    
    public int totalNQueens(int n) {
        boolean[] visited = new boolean[n];
        boolean[] dia1 = new boolean[2*n-1];
        boolean[] dia2 = new boolean[2*n-1];
        
        solve(n, visited,dia1,dia2,0);
        
        return result; 
    }
    
    
    private void solve(int n, boolean[] visited, boolean[] dia1, boolean[] dia2, int rowIndex){
        
        // base case: If all queens are placed increment result
        if(rowIndex == n){
            result++;
            return;
        }
        
        // Try placing queen in all rows one by one
        for(int i=0;i<n;i++){

            if(visited[i] || dia1[rowIndex+i] || dia2[rowIndex-i+n-1])
                continue;
            
            visited[i] = true;
            dia1[rowIndex+i] = true;
            dia2[rowIndex-i+n-1] = true;

            solve(n,visited,dia1,dia2,rowIndex+1);

            visited[i] = false;
            dia1[rowIndex+i] = false;
            dia2[rowIndex-i+n-1] = false;
        }
    }
    
    
}