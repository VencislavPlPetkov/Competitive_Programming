
/**
 * Search in Rotated Sorted Array
 * 
 * You are given an integer array nums sorted in ascending order, and an integer  * target.
 * 
 * Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2, * 4,5,6,7] might become [4,5,6,7,0,1,2]).
 * 
 * If target is found in the array return its index, otherwise, return -1.
 * 
 * Example:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * Example:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */





class Solution {
    public int search(int[] nums, int target) {
        
        if(nums.length == 0 || nums == null) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right) {
            
            int midpoint = (left+right)/2;
            
            if(nums[midpoint] > nums[right]){
                
                left = midpoint + 1;
                
            } else {
                
                right = midpoint;
            }
            
        }
        
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        if(target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }
        
        while(left <= right){
            
            int midpoint = (left+right)/2;
            
            if(nums[midpoint] == target) return midpoint;
            
            if(target < nums[midpoint]){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
            
        }
        
        
        return -1;
    }
}