
/**
 * 
 * Largest Rectangle in Histogram
 * 
 * Given an array of integers heights representing the histogram's bar  * height where the width of each bar is 1, return the area of the largest  * rectangle in the histogram.
 *
 * Example 1:
 * 
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10  * units.
 * 
 * Example 2:
 * 
 * Input: heights = [2,4]
 * Output: 4
 * 
 * 
 */




class Solution {
    public int largestRectangleArea(int[] heights) {
        
        if(heights.length == 0)
            return 0;
        
        int max = 0;
        
        // Store all passed indxs larger then prev indx in a stack
        Stack<Integer> stack = new Stack<>();
        
        stack.add(0);        
        
        for(int i = 1; i < heights.length; i++) {
            
            int currValue = heights[i];
            
            int lastIndexOnStack = stack.peek();
            int lastValue = heights[lastIndexOnStack];
            
            
            if(currValue >= lastValue){
                
                // Since curValue is NOT lower then lastValue. Add index of curValue to stack 
                stack.add(i);
                
            } else {
                
                // If curValue IS lower then lastValue and stack is not empty
                while(!stack.isEmpty() && currValue < heights[stack.peek()]){
                    
                    int tempValue = heights[stack.pop()];
                    
                    if(stack.isEmpty()){
                        
                        int curArea = tempValue * i;
                        max = Math.max(max, curArea);
                   
                    } else {
                        
                        int lastElement = stack.peek();
                        int with = i - lastElement -1;
                        int area = tempValue * with;
                        
                        max = Math.max(max, area);
                        
                    }
                    
                }
                
                stack.add(i);
                
            }
            
        }
        
        // Case where all values have been increasing
        // There are elmnts that have not been processed in the stack
        
        if(!stack.isEmpty()){
            
            int i = heights.length;
            
            while(!stack.isEmpty()){
                    
                    int tempValue = heights[stack.pop()];
                    
                    if(stack.isEmpty()){
                        
                        int curArea = tempValue * i;
                        max = Math.max(max, curArea);
                   
                    } else {
                        
                        int lastElement = stack.peek();
                        int with = i - lastElement -1;
                        int area = tempValue * with;
                        
                        max = Math.max(max, area);
                        
                    }
                    
            }
        }
        
        
        return max;
    }
}

