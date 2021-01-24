
/**
 * Permutations
 * 
 * Given an array nums of distinct integers, return all the possible permutations.  * You can return the answer in any order.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * Example 2:
 * 
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 */



class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        getPermutations(nums, result, new ArrayList<Integer>());
        
        return result;        
    }
    
    public void getPermutations(int[] nums, List<List<Integer>> result, List<Integer> current){
        
        if(current.size() == nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }
        
        
        for(int i = 0; i < nums.length; i++){
            if(current.contains(nums[i])) continue;
            
            current.add(nums[i]);
            
            getPermutations(nums, result, current);
            
            current.remove(current.size() - 1);
            
        }
        
    }
    
    
}