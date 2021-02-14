/**
 * SQRT
 * 
 * Given a non-negative integer x, compute and return the square root of x.
 * 
 * Since the return type is an integer, the decimal digits are truncated, and  * only the integer part of the result is returned.
 * 
 * Example 1:
 * 
 * Input: x = 4
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is  * truncated, 2 is returned.
 */


class Solution {
	public int mySqrt(int x) {
	  if (x < 2) return x;
  
	  long num;
	  int mid, left = 1, right = x;
	  
	  while (left <= right) {
	   
		mid = left + (right - left) / 2;
		
		num = (long)mid * mid;
		  
		if (num > x) right = mid - 1;
		else if (num < x) left = mid + 1;
		else return mid;
	  
	  }
  
	  return right;
	}
  }