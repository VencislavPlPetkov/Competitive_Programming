class Solution {
    public int maxArea(int[] height) {
        
        int j = 0;
        int k = height.length - 1;
        
        int maxArea = 0;
        
        while(j<k) {

            if(height[j] < height[k]){
                maxArea = Math.max(maxArea, height[j]*(k-j));
                j++;
            } else {
                maxArea = Math.max(maxArea, height[k]*(k-j));
                k--;
            }
        }
        
        
        return maxArea;
        
    }
}


