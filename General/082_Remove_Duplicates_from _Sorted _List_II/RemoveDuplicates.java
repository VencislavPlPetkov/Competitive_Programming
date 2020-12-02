/**
 * 
 * Remove Duplicates from Sorted List II
 * 
 * 
 * Given a sorted linked list, delete all nodes that have  * duplicate numbers, leaving only distinct numbers from  * the original list.
 * 
 * Return the linked list sorted as well.
 * 
 * Example 1:
 * 
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * 
 * Example 2:
 * 
 * Input: 1->1->1->2->3
 * Output: 2->3
 * 
 * 
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
               
               int duplicate = prev.next.val;
               
               while (prev.next != null && prev.next.val == duplicate) {
               
                  prev.next = prev.next.next;
                
               }
           } else {
               prev = prev.next;
           }
        
        }
        
        return dummy.next;
        
    }
}








