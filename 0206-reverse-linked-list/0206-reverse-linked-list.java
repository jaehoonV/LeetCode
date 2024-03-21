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
        ListNode output = null;
        ListNode h = head;
        ListNode nextNode = null;
        while (h != null) {
            nextNode = h.next;
            h.next = output;
            output = h;
            h = nextNode;
        }
        return output;
    }
}