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



