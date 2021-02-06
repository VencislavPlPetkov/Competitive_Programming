/**
 * Merge Intervals
 * 
 * Given an array of intervals where intervals[i] = [starti, endi], merge all  * overlapping intervals, and return an array of the non-overlapping intervals that  * cover all the intervals in the input.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * 
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */




class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));        
        
        List<int[]> result = new ArrayList<>();
        
        int[] current_interval = intervals[0];
        
        result.add(current_interval);
        
        for(int[] interval : intervals){
            
            int currentBegin = current_interval[0];
            int currentEnd = current_interval[1];
            
            int nextBegin = interval[0];
            int nextEnd = interval[1];
            
            if(currentEnd >= nextBegin){
                current_interval[1] = Math.max(currentEnd, nextEnd);
            } else {
                current_interval = interval;
                result.add(current_interval);
            }
            
        }
 
        
        return result.toArray(new int[result.size()][]);
    }
}




