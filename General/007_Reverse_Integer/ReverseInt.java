
/**
 * 
 * Reverse Integer
 * 
 * Given a 32-bit signed integer, reverse digits of an  * integer.
 * 
 * Example 1:
 * 
 * Input: x = 123
 * Output: 321
 * Example 2:
 * 
 * Input: x = -123
 * Output: -321
 * Example 3:
 * 
 * Input: x = 120
 * Output: 21
 * 
 */




class Solution {
    public int reverse(int x) {
        
        int val = Math.abs(x);
        
        int reversed = 0;
        
        while(val != 0) {
        
            int num = val % 10;
            val /= 10;
            
            
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && num > 7)) return 0;
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && num < -8)) return 0;
           
            reversed = reversed * 10 + num;
            
        }

        
        if(x<0) reversed *= -1;
        
        return reversed;
        
    }
}



