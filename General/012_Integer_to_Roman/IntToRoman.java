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