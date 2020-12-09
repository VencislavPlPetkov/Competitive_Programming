
/**
 * 
 * Remove Nth Node From End of List
 * 
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * 
 * Example:
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * 
 * Example:
 * Input: head = [1,2], n = 1
 * Output: [1]
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        while(fast.next != null && n > 0){
            n--;
            fast = fast.next;
        }
        
        while(fast.next != null){
        
            slow = slow.next;
            fast = fast.next;
        }
        
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }
}