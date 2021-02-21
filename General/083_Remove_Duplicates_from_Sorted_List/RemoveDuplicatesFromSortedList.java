
/**
 * Remove Duplicates From Sorted List
 * 
 * Given the head of a sorted linked list, delete all duplicates such that  * each element appears only once. Return the linked list sorted as well.
 * 
 *  
 * Example 1:
 * 
 * Input: head = [1,1,2]
 * Output: [1,2]
 * 
 * Example 2:
 * 
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        
        
        while (prev.next != null && prev.next.next != null) {
            
           if(prev.next.val == prev.next.next.val) {
               
                  prev.next = prev.next.next;
               
           } else {
               prev = prev.next;
           }
        
        }
        
        return dummy.next;
        
    }
}

