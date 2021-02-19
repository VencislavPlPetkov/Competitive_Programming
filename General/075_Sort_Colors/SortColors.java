
/**
 * Sort Colors
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them  * in-place so that objects of the same color are adjacent, with the colors in  * the order red, white, and blue.
 * 
 * We will use the integers 0, 1, and 2 to represent the color red, white, and  * blue, respectively.
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * 
 * Example 2:
 * 
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 */



class Solution {
    public void sortColors(int[] nums) {
		int lo = 0, hi = nums.length - 1, i = 0;
		
		while (i <= hi) {
			if      (nums[i] == 0) swap(nums, lo++, i++);
			else if (nums[i] == 2) swap(nums, i, hi--);
			else if (nums[i] == 1) i++;
		}
	}

	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
}