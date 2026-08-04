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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstP = dummy;
        ListNode secP = dummy;

        for(int i =0;i<n;i++){
            secP = secP.next;
        }

        while(secP.next !=null){
            firstP = firstP.next;
            secP = secP.next;
        }
        firstP.next = firstP.next.next;

        return dummy.next;
        
    }
}
