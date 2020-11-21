class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int numNeeded = target - nums[i];
            
            if(!map.containsKey(numNeeded)) {
                
                map.put(nums[i],i);
                
            } else {
                
                res[0] = i;
                res[1] = map.get(numNeeded);
                
            }
            
        }
        
        return res;        
    }
}