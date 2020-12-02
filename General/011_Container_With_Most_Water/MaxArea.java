
/**
 * 
 *  Container with most water
 * 
 * Given n non-negative integers a1, a2, ..., an ,  * where each represents a point at coordinate (i, ai).  * n vertical lines are drawn such that the two  * endpoints of the line i is at (i, ai) and (i, 0).  * Find two lines, which, together with the x-axis  * forms a container, such that the container contains  * the most water.
 * 
 * 
 * Example:
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are  * represented by array [1,8,6,2,5,4,8,3,7]. In this  * case, the max area of water (blue section) the  * container can contain is 49.
 *
 * Example:
 * 
 * Input: height = [4,3,2,1,4]
 * Output: 16
 * 
 * Example:
 * 
 * Input: height = [1,2,1]
 * Output: 2 
 * 
 * 
 */






class Solution {
    public int maxArea(int[] height) {
        
        int j = 0;
        int k = height.length - 1;
        
        int maxArea = 0;
        
        while(j<k) {

            if(height[j] < height[k]){
                maxArea = Math.max(maxArea, height[j]*(k-j));
                j++;
            } else {
                maxArea = Math.max(maxArea, height[k]*(k-j));
                k--;
            }
        }
        
        
        return maxArea;
        
    }
}


