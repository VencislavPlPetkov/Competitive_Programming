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
	  
		if (intervals.length <= 1) {
			return intervals;
		}
		
		Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0], arr2[0]));
		
		LinkedList <int[]> output = new LinkedList<>();
		
		for (int[] interval : intervals) {
			
			
			if (output.isEmpty() || interval[0] > output.getLast()[1]) {
				
				output.add(interval);
				
			} else {
				
				output.getLast()[1] = Math.max(interval[1], output.getLast()[1]);
			}
			
		}
		
		
		return output.toArray(new int[output.size()][]);
	}
  }
  