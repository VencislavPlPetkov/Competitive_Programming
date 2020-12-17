
/**
 * Merge Two Sorted Lists
 * 
 * Merge two sorted linked lists and return it as a new sorted list.  * The new list should be made by splicing together the nodes of the  * first two lists.
 * 
 * Example:
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       
        ListNode prehead = new ListNode();
        ListNode prev = prehead;
        
        while(l1 != null && l2 != null){
            
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            
            prev = prev.next;
        }
        
        prev.next = l1 == null ? l2:l1;
        
        return prehead.next;
    }
}