/**
 * Unique Permutations 
 * 
 * Given a collection of numbers, nums, that might contain  * duplicates, return all possible unique permutations in any  * order.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [1,1,2]
 * Output:
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */






class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> results = new ArrayList<>();
        
        Arrays.sort(nums);
        
        findAllPermutations(results, nums, new ArrayList<>(), new boolean[nums.length]);
        
        return results;
    }
    
    
    public void findAllPermutations(List<List<Integer>> results, int[] nums, List<Integer> tempList, boolean[] used) {
        
        if (tempList.size() == nums.length) {
            
            results.add(new ArrayList<>(tempList));
            
        } else {
            
            for (int i = 0; i < nums.length; i++) {
            
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;

                 
                used[i] = true;
                
                tempList.add(nums[i]);

                findAllPermutations(results, nums, tempList, used);

                used[i] = false;
                
                tempList.remove(tempList.size() - 1);
                

            }
        }
        
    }
    
}