

/**
 * 
 * Longest Substring Without Repeating Characters
 * 
 * 
 * Given a string s, find the length of the longest  * substring without repeating characters.
 *  
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a  * subsequence and not a substring.
 * 
 *
 */



class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int longest = 0;
        int begin = 0;
        int end = 0;
        int sLength = s.length();
        
        HashSet set = new HashSet();
        
        while (begin < sLength && end < sLength) {
            
            char chEnd = s.charAt(end);
            char chBegin = s.charAt(begin);
            
            if(!set.contains(chEnd)){
                
                set.add(chEnd);
                end++;
                
                longest = Math.max(longest, end-begin);
                
            } else {

                set.remove(chBegin);
                begin++;
            
            }
            
        }

        
        return longest;
    }
}