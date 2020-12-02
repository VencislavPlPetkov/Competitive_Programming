
/**
 * 
 * Integer to Roman
 * 
 * Example 1:
 * 
 * Input: num = 3
 * Output: "III"
 * Example 2:
 * 
 * 
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 5:
 * 
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 * 
*/





class Solution {
    public String intToRoman(int num) {
        
        String[] rNums = {"M", "CM", "D", "CD", "C", "XC", "L",
                       "XL", "X", "IX", "V", "IV", "I"};
        
        int[] lNums = {1000, 900, 500, 400, 100, 90, 50, 40,
                      10, 9, 5, 4, 1};
        
        String intToRom = "";

        int i = 0;
        while ( num > 0) {

            while (i < lNums.length) {
                
                int lNum = lNums[i];

                if(num - lNum >= 0) {

                    num = num - lNums[i];

                    intToRom = intToRom + rNums[i];
                    
                    break;
                }
                
                i++;
            }
        }
                   
        
        
        return intToRom;
    }
}