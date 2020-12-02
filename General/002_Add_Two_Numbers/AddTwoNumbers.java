/**
 * 
 * Add two numbers
 * 
 * 
 * You are given two non-empty linked lists representing  * two non-negative integers. The digits are stored in  * reverse order and each of their nodes contain a single  * digit. Add the two numbers and return it as a linked  * list.
 * 
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode res = result;
        
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
                
            int sum = carry + val1 + val2;
            carry = sum / 10;

            res.next = new ListNode(sum%10);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            res = res.next;
            
        }
        
        if(carry>0){
            res.next= new ListNode(carry);
        }
        
        return result.next;
    }
}