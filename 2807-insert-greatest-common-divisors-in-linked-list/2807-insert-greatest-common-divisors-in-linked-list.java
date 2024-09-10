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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        ListNode output = new ListNode(0);
        ListNode output_node = output;
		
        while (temp.next != null) {
            int a = temp.val;
            int b = temp.next.val;
			
            output_node.next = new ListNode(a);
            output_node = output_node.next;
			
            int k = func(a, b);
			
            output_node.next = new ListNode(k);
            output_node = output_node.next;
            temp = temp.next;
        }
        output_node.next = new ListNode(temp.val);
		
        return output.next;
    }
	
    public int func(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
		
        return a;
    }
}