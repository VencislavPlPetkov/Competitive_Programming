
/**
 * Rotate List
 * 
 * Given the head of a linked list, rotate the list to the right by k places.
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        
        int n=1;
  
        ListNode tail = head;
        
        while(tail.next != null) {
            ++n;
            tail = tail.next;
        }
        
        k %=n;
        
        if(k==0) return head;
        
        int stepsToNewHead = n-k;
       
        tail.next = head;
        
        ListNode newTail = tail;
        
        while (stepsToNewHead -- > 0){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        
        newTail.next = null;
        
        return newHead;
    }
}






