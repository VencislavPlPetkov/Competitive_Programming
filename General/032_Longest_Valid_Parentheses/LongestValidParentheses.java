
/**
 * Longest Valid Parentheses
 * 
 * Given a string containing just the characters '(' and ')', find the length of the  * longest valid (well-formed) parentheses substring.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * 
 * Example 2:
 * 
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 */



class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int longest = 0;
      
        for (int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '('){
                stack.push(i);
            } else {
                stack.pop();
                
                if (stack.isEmpty()){
                    stack.push(i);
                } else {
                    longest = Math.max(longest, i - stack.peek());
                }
            }
            
        }
        
        return longest;
    }
}