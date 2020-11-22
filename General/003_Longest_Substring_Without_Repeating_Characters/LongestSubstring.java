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