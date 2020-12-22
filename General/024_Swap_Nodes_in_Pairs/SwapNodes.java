
/**
 * Swap Nodes in Pairs
 * 
 * Given a linked list, swap every two adjacent nodes  * and return its head.
 * 
 * You may not modify the values in the list's nodes.  * Only nodes itself may be changed.
 * 
 *  
 * Example:
 * 
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * 
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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        
        while(p.next != null && p.next.next != null){
            
            ListNode first = p.next;
            ListNode second = p.next.next;
            
            p.next = second;
                
            first.next = second.next;
            second.next = first;
            
            p = first;
        }
        
       
        return dummy.next;
       
    }
}


