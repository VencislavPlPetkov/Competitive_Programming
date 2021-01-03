
/**
 * Find First and Last Position of Element in Sorted Array
 * 
 * Given an array of integers nums sorted in ascending order, find  * the starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * Follow up: Could you write an algorithm with O(log n) runtime  * complexity?
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 */





class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = {-1, -1};
        
        res[0] = findFirstIndex(nums, target);
        res[1] = findLastIndex (nums, target);
        
      
        return res;
    }
    
    
    public int findFirstIndex (int[] nums, int target) {
        
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            
            int midpoint = left + (right - left) / 2;
            
            if (nums[midpoint] >= target) {
                
                right = midpoint - 1;
                
            } else {
                
                left = midpoint + 1;
            }
            
            
            if (nums[midpoint] == target) index = midpoint; 
            
        }
        
        return index;
    }
    
    
    public int findLastIndex (int[] nums, int target) {
        
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            
            int midpoint = left + (right - left) / 2;
            
            if (nums[midpoint] <= target) {
                
                left = midpoint + 1;
            
            } else {
                
                right = midpoint - 1;
            }
            
            
            if (nums[midpoint] == target) index = midpoint;
            
        }
        
               
        return index;
    }
    
}








