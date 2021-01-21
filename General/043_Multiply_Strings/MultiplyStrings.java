
/**
 * Multiply Strings
 * 
 * Given two non-negative integers num1 and num2 represented as strings, return the  * product of num1 and num2, also represented as a string.
 * 
 * Note: You must not use any built-in BigInteger library or convert the inputs to  * integer directly.
 * 
 *  
 * Example 1:
 * 
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * 
 * 
 * Example 2:
 * 
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 */




class Solution {
    public String multiply(String num1, String num2) {
        
        if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
        
        int num1Length = num1.length();
        int num2Length = num2.length();
    
        int []res = new int[num1Length + num2Length];
        
        for(int i = num1Length - 1; i >= 0; i--){
            
            for(int j = num2Length - 1; j >= 0; j--){
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                
                int multiplied = digit1 * digit2;
                int sum = res[i + j + 1] + multiplied;
                
                res[i+j] += sum / 10;
                res[i + j + 1] = sum % 10;
                
            }

        }
        
        // Eliminate leading zeros from beginning of the string
        int k = 0;
        
		while (res[k] == 0 && k < res.length) {
			++k;
		}
        
        
        // Convert result to String
        String result = "";
        
		for (; k < res.length; k++) {
			result += String.valueOf(res[k]);
		}
		
        return result;
    }
}





