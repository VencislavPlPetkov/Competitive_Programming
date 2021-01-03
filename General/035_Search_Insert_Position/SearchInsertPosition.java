
/**
 * 
 * Search Insert Position
 * 
 * Given a sorted array of distinct integers and a target value,  * return the index if the target is found. If not, return the index  * where it would be if it were inserted in order.
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * Example 3:
 * 
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * 
 * Example 4:
 * 
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * 
 */





class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            
            int midpoint = left + (right - left) / 2;
            
            if(nums[midpoint] == target) return midpoint;
            
            if(nums[midpoint] > target){
                right = midpoint - 1;
            } else {
                left = midpoint + 1;
            }
            
        }
        
        
        return left;
    }
}

