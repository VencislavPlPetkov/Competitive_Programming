

/**
 * 
 * Valid Parentheses
 * 
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of  * brackets.
 * Open brackets must be closed in the correct order.
 * 
 * Example:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 4:
 * Input: s = "([)]"
 * Output: false
 * 
 * 
 */



class Solution {
    public boolean isValid(String s) {
       if(s == null || s.length() == 1) return false;
        
        HashMap <Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');
        
        Stack<Character> brackets = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(pairs.containsValue(s.charAt(i))){
                brackets.push(s.charAt(i));
            } else if(!brackets.isEmpty()){
         
                if(brackets.peek() != pairs.get(s.charAt(i))){
                    return false;
                }

                brackets.pop();
                
            } else {
                return false;
            }
        }
        
        
        return brackets.isEmpty();
    }
}

