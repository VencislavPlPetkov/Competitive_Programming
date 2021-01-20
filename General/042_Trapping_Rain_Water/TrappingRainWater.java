/** 
 * Trapping Rain Water
 * 
 * Given n non-negative integers representing an elevation map where the width of  * each bar is 1, compute how much water it can trap after raining.
 * 
 * Example 1:
 * 
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * 
 * Explanation: The above elevation map (black section) is represented by array [0,1, * 0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being  * trapped.
 * 
 * Example 2:
 * 
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */





class Solution {
    public int trap(int[] height) {
        
        if(height == null || height.length == 0) return 0;
        
        int[] leftHeighest = new int[height.length];
        
        int[] rightHeighest = new int[height.length];
        
        int trappedWater = 0;
        
        leftHeighest[0] = height[0];
        rightHeighest[height.length - 1] = height[height.length - 1];
        
        // Get highest possible values from left to right 
        for(int i = 1; i < height.length; i++){
            leftHeighest[i] = Math.max(leftHeighest[i-1], height[i]);
        }
        
        // Get highest possible values from right to left 
        for(int i = height.length - 2; i > 0; i--){
            rightHeighest[i] = Math.max(rightHeighest[i+1], height[i]);
        }
        
        // Compare values from both direction. Find the matching area. Add to water
        for(int i = 1; i < height.length; i++){
            trappedWater += Math.min(leftHeighest[i], rightHeighest[i] ) - height[i];
        }
        
        
        return trappedWater;
    }

}
