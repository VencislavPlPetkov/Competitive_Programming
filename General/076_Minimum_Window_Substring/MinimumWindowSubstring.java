
/**
 * 
 * Minimum Window Substring
 * 
 * Given two strings s and t of lengths m and n respectively, return the minimum  * window substring of s such that every character in t (including duplicates) is  * included in the window. If there is no such substring, return the empty string "".
 * 
 *  
 * Example:
 * 
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from  * string t.
 * 
 * 
 * 
 */



class Solution {
	public String minWindow(String s, String t) {
  
		if (s.length() == 0 || t.length() == 0) {
			return "";
		}
  
		// Map with all unique characters in t
		Map<Character, Integer> uniqueCharsToFind = new HashMap<Character, Integer>();
		for (int i = 0; i < t.length(); i++) {
			int count = uniqueCharsToFind.getOrDefault(t.charAt(i), 0);
			uniqueCharsToFind.put(t.charAt(i), count + 1);
		}
  
	   
		int i = 0, j = 0;
		int countOfCharsNeeded = uniqueCharsToFind.size();

		int leftIdxMinWindow = 0, rightIdxMinWindow = s.length() - 1;
		int min = s.length();
		
		boolean found = false;
		
		

		while(j < s.length()) {
			
			// j++
			char rightEndChar = s.charAt(j++);
			
			if(uniqueCharsToFind.containsKey(rightEndChar)){
				
				// found -> decrease value of character in map
				uniqueCharsToFind.put(rightEndChar, uniqueCharsToFind.get(rightEndChar) - 1);
				
				//if the value in the map is == 0, all neededed chars of this type are found -> countOfCharsNeeded--;
				if(uniqueCharsToFind.get(rightEndChar) == 0) {
					countOfCharsNeeded -= 1;
				}
			}
		   
			
			// Not all chars are found -> start again loop
			if(countOfCharsNeeded > 0) continue;
			
			
			
			// i++
			// while all chars are found, contract the window
			while(countOfCharsNeeded == 0){
				
				char leftEndChar = s.charAt(i++);
			
				if(uniqueCharsToFind.containsKey(leftEndChar)){
  
					uniqueCharsToFind.put(leftEndChar, uniqueCharsToFind.get(leftEndChar) + 1);
  
					if(uniqueCharsToFind.get(leftEndChar) > 0) {
						countOfCharsNeeded += 1;
					}
  
				}
			
			}
		
			
			
			// All unnecessary chars are cut	
			if((j-i) < min) {
				
				leftIdxMinWindow = i;
				rightIdxMinWindow = j;
				
				min = j-i;
				
				found = true;
			}
			
		  
	  }
  
		
	  return !found ? "" : s.substring(leftIdxMinWindow - 1, rightIdxMinWindow);
	}
  }
  
  
  
  
    
