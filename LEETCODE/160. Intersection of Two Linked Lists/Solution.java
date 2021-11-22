/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public int get_length(ListNode ll){
        if(ll==null)
            return 0;
        return 1 + get_length(ll.next);
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = get_length(headA);
        int l2 = get_length(headB);
        
        while(l1!=l2){
            if(l1>l2){
                headA = headA.next;
                l1--;
            }else{
                headB = headB.next;
                l2--;
            }
        }
        
        while(headA!=null && headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        //System.out.println(headA.val +" "+headB.val);
        
        return headA;
    }
}