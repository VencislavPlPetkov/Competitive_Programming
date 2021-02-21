
/**
 * Search In Rotated Sorted Array 2
 * 
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * 
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums. * length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,  * nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and  * become [4,5,6,6,7,0,1,2,4,4].
 * 
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or  * false if it is not in nums.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * 
 * Example 2:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
 */


class Solution {
    public boolean search(int[] nums, int target) {
        if (null == nums || 0 == nums.length)
      return false;
    
    int lo = 0;
    int hi = nums.length - 1;
    while (lo <= hi) {
      // to avoid duplicates
      while (lo < hi && nums[lo] == nums[lo + 1])
        ++lo;
      while (lo < hi && nums[hi] == nums[hi - 1])
        --hi;
      
      int mid = lo + (hi - lo) / 2;
      if (nums[mid] == target)
        return true;
      
      if (nums[mid] >= nums[lo]) {
        if (target >= nums[lo] && target < nums[mid])
          hi = mid - 1;
        else
          lo = mid + 1;
      } else {
        if (target <= nums[hi] && target > nums[mid])
          lo = mid + 1;
        else
          hi = mid - 1;
      }
    }
    
    return false;
    }
}

