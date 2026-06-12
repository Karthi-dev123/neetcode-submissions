# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        # traverse l1 and then l2 , collect all the 'val' and then store in an array 
        # sort the array 
        # build a new linked list from the array 

        chumma = []

        i = list1 

        while i != None:
            chumma.append(i.val)
            i = i.next 
        
        i = list2 

        while i != None:
            chumma.append(i.val)
            i = i.next 
        
        chumma.sort() # this is 'in place' sorting , so mind it 

        head = None 
        tail = head
        # lets construct a new ll now 
        for i in chumma:
            if head == None:
                head = ListNode(i)
                tail = head
                continue
            tail.next = ListNode(i)
            tail = tail.next
        return head
            


        
        