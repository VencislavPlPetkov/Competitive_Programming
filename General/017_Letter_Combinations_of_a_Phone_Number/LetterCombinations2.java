
/**
 * 
 * Letter Combinations of a Phone Number
 *
 * Given a string containing digits from 2-9 inclusive, return all  * possible letter combinations that the number could represent.  * Return the answer in any order.
 * 
 * Example:
 * 
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 
 * Example:
 * 
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *  
 * 
 */



class Solution {
    public List<String> letterCombinations(String digits) {
        // Queue, BFS
        LinkedList<String> result = new LinkedList();
        
        if(digits.length() == 0) return result;
        
        result.add("");
        
        String[] mapping = {
        	"0",
        	"1",
        	"abc",
        	"def",
        	"ghi",
        	"jkl",
        	"mno",
        	"pqrs",
        	"tuv",
        	"wxyz"
        };
        
        
        
        for(int i = 0; i < digits.length(); i++){
            // With input "237" this will parse the digit so that it could take the mapping letters for that digit
            int index = Character.getNumericValue(digits.charAt(i));
            
            
            // If the input is three digits this will take all permutations in the result that are less then three letters and loop through them
            while(result.peek().length() == i){
                
                // asssign the permutation that is shorter then the input string and remove it
                String permutation = result.remove();
                
                // Loop through all letters for the digit and append them to the result
                for(char c : mapping[index].toCharArray()){
                    
                    // add to the permutation that was already in the result
                    result.add(permutation + c);
                }
                
            }
            
        }
        
        
       return result; 
        
    }
}