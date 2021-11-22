# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        
        if head is None:
            return head
        
        
        tmp = head;
        prev = None;
        
        while tmp.next!=None:
            if head.val==val:
                head = head.next
                tmp=tmp.next
            elif tmp.next.val==val:
                prev = tmp;
                tmp.next = tmp.next.next
            else:
                tmp=tmp.next
        
        if head.val==val:
            head = head.next
            tmp=tmp.next
                     
        return head
        
        
        
                
