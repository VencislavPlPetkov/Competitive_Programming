/**
 * First Missing Positive
 * 
 * Given an unsorted integer array nums, find the smallest missing positive integer.
 * 
 * Follow up: Could you implement an algorithm that runs in O(n) time and uses  * constant extra space.?
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,0]
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * 
 * Example 3:
 * 
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 */





class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) return 1;
        boolean foundOne = false;
        
        // Convert all negative and big numbers to 1
        // [3,5,-1,1] -> [3,1,1,1]
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 1){
                foundOne = true;
            } else if(nums[i] <= 0 || nums[i] > nums.length){
                nums[i] = 1;
            }
            
            
        }
        
        if(!foundOne) return 1;
        
        // Set minus sign to all met numbers(using array index)
        // [1,2,1] -> [-1,-2,-1]
        for(int i = 0; i < nums.length; i++){
            
            int index = Math.abs(nums[i]) - 1;
          
            if(nums[index] > 0){
                nums[index] *= -1;
            }
            
        }
        
        // If a number(index) isn't with minus sign than it has not
        // been met so this is the answer
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] > 0){
                return i + 1;
            }
            
        }
        
        // if all numbers(indexes) are met, answer is next number after last index
        return nums.length + 1;
    }
}




