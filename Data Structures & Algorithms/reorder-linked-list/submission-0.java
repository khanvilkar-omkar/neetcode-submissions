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
    public void reorderList(ListNode head) {

        // first findings the middle
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // now reserve the right side of linklist
        ListNode second = p1.next;
        ListNode prev = p1.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }


        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }

        
    }
}
