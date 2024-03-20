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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node = list1;
        int i = 0;
        
        while (i < a - 1) {
            node = node.next;
            i++;
        }
        ListNode temp = node; 
        
        while (i < b + 1) {
            node = node.next;
            i++;
        }
        ListNode rear = node;
        ListNode t = list2, h = list2;
        
        while (t.next != null) {
            t = t.next;
        }
        
        temp.next = h;
        t.next = rear;
        return list1; 
    }
}