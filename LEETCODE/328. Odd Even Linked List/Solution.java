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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode oh = head;
        ListNode eh = head.next;
        
        ListNode po = oh;
        ListNode pe = eh;
        
        head = head.next.next;
        
        
        int k=0;
        while(head!=null){
            if(k%2==0){
                po.next = head;
                po = po.next;
            }else{
                pe.next = head;
                pe=pe.next;
            }
            head=head.next;
            k++;
        }
        
        po.next =eh;
        pe.next = null;
        
        return oh;
        
    }
}