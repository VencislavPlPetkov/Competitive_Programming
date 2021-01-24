
/**
 * Group Anagrams
 * 
 * Given an array of strings strs, group the anagrams  * together. You can return the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the  * letters of a different word or phrase, typically using all  * the original letters exactly once.
 * 
 *  
 * Example 1:
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> results = new ArrayList<>();
        
        Map<String,List<String>> used = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            
            String original = strs[i];
            
            char[] chars = original.toCharArray();
            
            Arrays.sort(chars);
            
            String sorted = new String(chars);
            
            if(used.containsKey(sorted)){
                used.get(sorted).add(original);
            } else {
               List<String> list = new ArrayList<>();
               list.add(original);
               used.put(sorted, list);
            }


        }
        
        for (List<String> value : used.values()) {
            results.add(value);
        }
        
        
        return results;
    }
}


