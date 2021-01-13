/**
 * Combination Sum 2
 * 
 * Given a collection of candidate numbers (candidates) and a  * target number (target), find all unique combinations in  * candidates where the candidate numbers sum to target.
 * 
 * Each number in candidates may only be used once in the  * combination.
 * 
 * Note: The solution set must not contain duplicate  * combinations.
 * 
 *  
 * Example 1:
 * 
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output: 
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 
 *
 * Example 2:
 * 
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output: 
 * [
 * [1,2,2],
 * [5]
 * ]
 */




class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinations(target, candidates, result, new ArrayList<Integer>(), 0);
        
        return result;
    }
    
    public void findCombinations(int target, int[] candidates,List<List<Integer>> result, List<Integer> combination, int startIndex){
        
        if(target == 0){
            result.add(new ArrayList<Integer>(combination));
            return;
        }
        
        
        for(int i = startIndex; i < candidates.length; i++){
            
            if (candidates[i] > target) break;
            
            if(i == startIndex || candidates[i] != candidates[i-1]){
                
                combination.add(candidates[i]);
                
                findCombinations(target - candidates[i], candidates, result, combination, i + 1);
                
                combination.remove(combination.size() - 1);
            }
            
        }
        
        
    }

}


