class Solution {
    public String longestPalindrome(String s) {
        
        if (s == null || s.length() < 1) return "";
        
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            int length1 = checkPalinrome(i, i, s);

            int length2 = checkPalinrome(i, i+1, s);
            
            int len = Math.max(length1, length2);
            
            if (len > end - start) {
                
                start = i - (len - 1) / 2;
                end = i + len / 2;
                
            }
            
        }
        
        return s.substring(start, end + 1);
    }
    
    public int checkPalinrome(int leftIndex, int rightIndex, String s) {
        
        int left = leftIndex;
        int right = rightIndex;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return right - left - 1;
    }
}






