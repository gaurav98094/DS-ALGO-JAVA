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
        
        if(head==null)
            return head;
        
        ListNode l1 = new ListNode(-101);
        ListNode h1 = null;
        ListNode l2 = new ListNode(-101);
        ListNode h2 = null;
        
        while(head!=null){
            
            if(head.val<x){
                if(l1.val == -101){
                    l1.val = head.val;
                    h1 = l1;
                }else{
                    ListNode n = new ListNode(head.val);
                    l1.next = n;
                    l1 = l1.next;
                }
            }else{
                if(l2.val == -101){
                    l2.val = head.val;
                    h2 = l2;
                }else{
                    ListNode n = new ListNode(head.val);
                    l2.next = n;
                    l2 = l2.next;
                }
            }
            
            head = head.next;
        }
        
        if(h1==null)
                return h2;
            else if(h2==null)
                return h1;
            
        l1.next = h2;
        return h1;
        
        
        
        
    }
}