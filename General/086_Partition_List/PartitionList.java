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
    public ListNode partition(ListNode head, int x) {
        
        ListNode before_Head = new ListNode();
        ListNode before = before_Head;
        
        ListNode after_Head = new ListNode();
        ListNode after = after_Head;
        
        while(head != null){
            
            if(head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            
            head = head.next;
            
        }
        
        after.next = null;
        before.next = after_Head.next;
        
        return before_Head.next;
    }
}