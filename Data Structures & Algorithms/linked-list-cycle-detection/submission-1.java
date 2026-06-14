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
    public boolean hasCycle(ListNode head) {
        // declare a rabbit - 2x 
        // declare a turtle - 1x 
        // keeps advancing , until they are pointing at the same node 
        // then you know , that there is a Cycle! 

        ListNode rabbit = head;
        ListNode turtle = head;

        do{
            if(head == null) return false;
            turtle = turtle.next;
            if(rabbit == null) return false;
            else if (rabbit.next == null) return false;
            else rabbit = rabbit.next.next; 
        }while(rabbit != turtle);

        return true;

    }
}
