/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.math.BigInteger; 

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        BigInteger num1 = listNodeToInt(l1);
        BigInteger num2 = listNodeToInt(l2);
           
        BigInteger sum = num1.add(num2);
         
        ListNode res = intToListNode(sum);
        

        return res;
        
    }
    
    
    // 2 -> 4 -> 3
    // 342
    public BigInteger listNodeToInt(ListNode l) {
        
        String numberStrRev = "";
        ListNode p = l;
        
        
        while (p != null){
            
            numberStrRev += p.val;
            p = p.next;
            
        }
        
		
		String numberStrCorrect = new StringBuilder(numberStrRev).reverse().toString();
        
        // long num = Long.valueOf(numberStrCorrect).longValue();
        
        BigInteger num = new BigInteger(numberStrCorrect);
        
        return num;
    }
    
    
    public ListNode intToListNode (BigInteger num){
        
        String strRev = String.valueOf(num);
        String strCorrect = new StringBuilder(strRev).reverse().toString();
        
        String firstChar = Character.toString(strCorrect.charAt(0));
        int firstNum = Integer.parseInt(firstChar);                                      
                                              
                                              
        
        ListNode res = new ListNode(firstNum);
        
        int strLength = strCorrect.length();
        
        if (strLength == 2){
            
            String secChar = Character.toString(strCorrect.charAt(1));
            int secNum = Integer.parseInt(secChar); 
            
            res.next = new ListNode(secNum);
            
        } else {
        
            ListNode p = res;

            int counter = 1;


            while (counter < strLength - 1) {

                for (int i = 1; i < strLength; i++) {

                    String curChar = Character.toString(strCorrect.charAt(i));
                    int curNum = Integer.parseInt(curChar);  

                    p.next = new ListNode(curNum);
                    p = p.next;
                counter++;

                }


            }
        }
        
        return res;
    }

    
    
}




