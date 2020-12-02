/** 

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) return "";
        
        String lcp = strs[0];
        
        for(int i = 1; i < strs.length; i++){
            
            int j = 0;
            
            while (j < strs[i].length() && j < lcp.length() && strs[i].charAt(j) == lcp.charAt(j)){
                j++;
            }
            
            lcp.substring(0, j-1);
            
        }
        
        
        return lcp;
    }
}


