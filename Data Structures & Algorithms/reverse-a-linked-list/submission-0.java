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
    public ListNode reverseList(ListNode head) {
        // so the idea is to use simply reverse the ll 
        // we use pointers for that 
        // prev , curr , next (pointers)

        // lets traverse through the ll
        ListNode prev = null;
        ListNode curr = head;
        

        while(curr != null){
            ListNode next = curr.next;
            // reverse the link
            curr.next = prev;
            // update next and curr 
            prev = curr;
            curr = next;

        }
        return prev;
    }
}
