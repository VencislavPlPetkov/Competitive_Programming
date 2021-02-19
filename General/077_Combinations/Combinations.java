
/**
 * Combinations
 * 
 * Given two integers n and k, return all possible combinations of k numbers out  * of 1 ... n.
 * 
 * You may return the answer in any order.
 * 
 * Example 1:
 * 
 * Input: n = 4, k = 2
 * Output:
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * 
 * Example 2:
 * 
 * Input: n = 1, k = 1
 * Output: [[1]]
 */



class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new LinkedList();
        
        if(k == 0){
            ans.add(new LinkedList());
            return ans;
        }
        
        backtrack(1, new LinkedList<Integer>(), n, k, ans);
        return ans;
    }
    
    public void backtrack(int start, LinkedList<Integer> cur, int n, int k, List<List<Integer>> ans){
        
        if (cur.size() == k) {
            ans.add(new LinkedList(cur));
        }
        
        for(int i =  start; i <= n && cur.size() < k; i++){
            
            cur.add(i);
            backtrack(i + 1, cur, n, k, ans);
            cur.removeLast();
        }
        
    }
    
    
}



