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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        
        int middle = len / 2;
        
        int count = 0;
        while (count < middle) {
            temp = temp.next;
            count++;
        }
        return temp;

    }
}