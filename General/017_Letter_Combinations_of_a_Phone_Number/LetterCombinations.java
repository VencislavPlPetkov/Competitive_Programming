
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
    
    List<String> res = new ArrayList<>();
    
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
    
    public List<String> letterCombinations(String digits) {
        
        if(digits == null || digits.length() == 0) return res;
        
        letterComb("", digits, 0);
        
        return res;
        
    }
    
    
    void letterComb(String combination, String digits, int index){
        
        if(index == digits.length()){
            res.add(combination);
            return;
        } 
        
        String letters = mapping[digits.charAt(index)-'0'];
        
        for(int i = 0; i<letters.length(); i++){
            
            letterComb(combination+letters.charAt(i), digits, index+1);
        }
        
    }
}



