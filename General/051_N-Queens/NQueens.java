
/**
 * N-Queens
 * 
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such  * that no two queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens' placement,  * where 'Q' and '.' both indicate a queen and an empty space, respectively.
 * 
 * 
 * Example 1:
 * 
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown  * above
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: [["Q"]]
 */






class Solution {
    
    List<List<String>> result = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        
        boolean[] visited = new boolean[n];
        boolean[] dia1 = new boolean[2*n-1];
        boolean[] dia2 = new boolean[2*n-1];
        
        solve(n, new ArrayList<String>(),visited,dia1,dia2,0);
        
        return result;
    }
    
    
    private void solve(int n, List<String> list, boolean[] visited, boolean[] dia1, boolean[] dia2, int rowIndex){
        
        // base case: If all queens are placed then add list to result
        if(rowIndex == n){
            result.add(new ArrayList<String>(list));
            return;
        }
        
        // Try placing queen in all rows one by one
        for(int i=0;i<n;i++){

            if(visited[i] || dia1[rowIndex+i] || dia2[rowIndex-i+n-1])
                continue;
            
            char[] charArray = new char[n];
            Arrays.fill(charArray,'.');
            charArray[i] = 'Q';
            String stringArray = new String(charArray);
            
            list.add(stringArray);
            
            visited[i] = true;
            dia1[rowIndex+i] = true;
            dia2[rowIndex-i+n-1] = true;

            solve(n,list,visited,dia1,dia2,rowIndex+1);

            list.remove(list.size()-1);
            charArray[i] = '.';
            visited[i] = false;
            dia1[rowIndex+i] = false;
            dia2[rowIndex-i+n-1] = false;
        }
    }
    
}