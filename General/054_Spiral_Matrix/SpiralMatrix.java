
/**
 * Spiral Matrix
 * 
 * Given an m x n matrix, return all elements of the matrix  * in spiral order.
 * 
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */





class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> nums = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0){
            return nums;
        }
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        int size = matrix.length * matrix[0].length;
        
        while(nums.size() < size) {
            
            for(int i = left; i <= right && nums.size() < size; i++) {
                nums.add(matrix[top][i]);
            }
            
            top++;
            
            for(int i = top; i <= bottom && nums.size() < size; i++) {
                nums.add(matrix[i][right]);
            }
            
            right--;
            
            for(int i = right; i >= left && nums.size() < size; i--) {
                nums.add(matrix[bottom][i]);
            }
            
            bottom--;
            
            for(int i = bottom; i >= top && nums.size() < size; i--) {
                nums.add(matrix[i][left]);
            }
            
            left++;
        }
        
        return nums;
    }
}



