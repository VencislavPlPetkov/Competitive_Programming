
/**
 * Implement strStr()
 * 
 * Return the index of the first occurrence of needle in  * haystack, or -1 if needle is not part of haystack.
 * 
 * 
 * Example:
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 */






class Solution {
    public int strStr(String haystack, String needle) {
        if((needle.equals("") && haystack.equals("")) || (needle.equals(""))) return 0;
        
        for(int i = 0; i < haystack.length(); i++){
            
            if(i <= haystack.length() - needle.length()){
                if(needle.equals(haystack.substring(i, i + needle.length()))){
                    return i;
                }
            }
            
        }
            
        
        return -1;
    }
}