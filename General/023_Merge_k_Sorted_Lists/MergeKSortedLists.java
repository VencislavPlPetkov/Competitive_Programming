/**
 * Merge K Sorted Lists
 * 
 * You are given an array of k linked-lists lists, each linked-list  * is sorted in ascending order.
 * 
 * Merge all the linked-lists into one sorted linked-list and return  * it.
 * 
 * s
 * Example:
 * 
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * 
 * Explanation: The linked-lists are:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * merging them into one sorted list:
 * 1->1->2->3->4->4->5->6
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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0)
            return null;
        
        int interval = 1;
        int length = lists.length;
        
        while(interval < length) {
            
            for(int i = 0; i < length - interval; i+= (interval*2)) {
                merge(lists, i, i + interval);
            }
            
            interval*=2;
            
        }
        
        return lists[0];

    }
    
    public void merge(ListNode[] lists, int index1, int index2){

        ListNode ans = new ListNode(-1);
        
        ListNode ptr = ans;
        ListNode l1 = lists[index1];
        ListNode l2 = lists[index2];
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            
            ptr = ptr.next;
        }       
     
        ptr.next = l1 == null?l2:l1;
        
        lists[index1] = ans.next;
    }

}


