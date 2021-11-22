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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        if(l1==null)
            return l2;
        
        if(l2==null)
            return l1;
        
        ListNode ll = new ListNode(-11);
        ListNode h1 = ll;
        
        int carry = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            //System.out.println(sum);
            
            int keep = sum%10;
            carry = sum/10;
            
            ListNode ob = new ListNode(keep);
            ll.next = ob;
            ll = ll.next;
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1!=null){
            int sum = l1.val + carry;
            
            int keep = sum%10;
            carry = sum/10;
            
            ListNode ob = new ListNode(keep);
            ll.next = ob;
            ll = ll.next;
            
            l1 = l1.next;
        }
        
        while(l2!=null){
            int sum = l2.val + carry;
            
            int keep = sum%10;
            carry = sum/10;
            
            ListNode ob = new ListNode(keep);
            ll.next = ob;
            ll = ll.next;
            
            l2 = l2.next;
        }
        
        if(carry!=0){
            ListNode ob = new ListNode(carry);
            ll.next = ob;
            ll = ll.next;
        }
        return h1.next;
    }
}