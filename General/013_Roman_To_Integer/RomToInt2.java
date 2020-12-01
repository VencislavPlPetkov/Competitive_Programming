class Solution {
    
    
    static HashMap<String, Integer> map = new HashMap();
    
    static {
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);
    }
    
    
    public int romanToInt(String s) {
        
        int result = 0;
        int i = 0;
        
        while( i < s.length()){
            
            int curVal = map.get(s.substring(i,i+1));
            
            int nextVal = 0;
            
            if(i < s.length() - 1) {
               nextVal = map.get(s.substring(i+1,i+2));
            }
            
            if(curVal < nextVal) {

                result += (nextVal- curVal);
                i += 2;
            } else {
                
                result += curVal;
                i += 1;
            }
            
            
        }
        
        
        
        return result;
    }
}










