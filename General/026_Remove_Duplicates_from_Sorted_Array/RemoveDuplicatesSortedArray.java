/**
 * Remove Duplicates Sorted Array
 * 
 * Given a sorted array nums, remove the duplicates  * in-place such that each element appears only once and  * returns the new length.
 * 
 * Example:
 * 
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * Explanation: Your function should return length = 2,  * with the first two elements of nums being 1 and 2  * respectively. It doesn't matter what you leave beyond  * the returned length.
 * 
 */





class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        int current = 0;

        for (int i = 1; i < nums.length; i++) {
            
            if(nums[i] != nums[current]) {
                
                current++;
                nums[current] = nums[i];
                
            }
            
        }
        
        return current+1;
        
    }
}