
/**
 * 
 * 
 * Determine whether an integer is a palindrome. An  * integer is a palindrome when it reads the same  * backward as forward.
 * 
 * 
 * Example:
 * 
 * Input: x = 121
 * Output: true
 * 
 * Example:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From  * right to left, it becomes 121-. Therefore it is not  * a palindrome.
 * 
 * 
 */



public class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }
}