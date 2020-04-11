

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    int[] results = new int[2]; 
    
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        
    int counter = 0;
        
    for (int i = 0; i < nums.length; i++) {

        int numNeeded = target - nums[i];
        
        if (numNeeded == nums[i]){
            
             if (m.get(nums[i]) == null) {
                m.put(nums[i], i); 
             } else {
                
                results[0] = m.get(numNeeded);
                results[1] = i;
                 
             }
        } else {
            
            
        
            System.out.print(numNeeded);

            if(m.get(nums[i]) == null) {
                m.put(nums[i], i); 
            }



            if(m.get(numNeeded) != null) {


                results[0] = m.get(numNeeded);
                results[1] = m.get(nums[i]);


            }


        }




    } 
        
        

        return results;
        
    }
}