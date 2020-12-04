
/**
 * 
 * Three Sum Closest
 * 
 * Given an array nums of n integers and an integer  * target, find three integers in nums such that the sum  * is closest to target. Return the sum of the three  * integers. You may assume that each input would have  * exactly one solution.
 * 
 * 
 * Example:
 * 
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is  * 2. (-1 + 2 + 1 = 2).
 * 
 * 
 */




class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int closest = nums[0] + nums[1] + nums[nums.length-1];
        
        for(int i = 0; i < nums.length; i++){
            
            int low = i+1;
            int high = nums.length-1;
            
            while(low < high){
                
                int sum = nums[i] + nums[low] + nums[high];
                
                if(target == sum) {
                    return target;
                }
                
                if(Math.abs(target - closest) > Math.abs(target-sum)){
                    closest = sum;
                }
                
                if(sum>target){
                    high--;   
                } else if (sum<target) {
                    low++;
                }
                
            }
            
            
        }
        
        return closest;
        
    }
}