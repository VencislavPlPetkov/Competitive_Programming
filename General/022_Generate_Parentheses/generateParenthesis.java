/**
 * Generate Parenthesis
 * 
 * Given n pairs of parentheses, write a function to generate  * all combinations of well-formed parentheses.
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 * 
 */



class Solution {
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> ans = new ArrayList<String>();
        
        backtrack(ans, "", 0, 0, n);
        
        return ans;
    }
    
    public void backtrack(ArrayList<String> ans, String current, int open, int close, int max){
        
        if(current.length() == max * 2){
            ans.add(current);
            return;
        }

        if(open < max)
            backtrack(ans, current + "(", open + 1, close, max);
        
        if(close < open)
            backtrack(ans, current + ")", open, close + 1, max);
    
    }
    
}