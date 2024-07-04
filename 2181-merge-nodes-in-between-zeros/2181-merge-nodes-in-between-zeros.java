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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = new ListNode(1000);
		ListNode output = node;
		head = head.next;
		int temp = 0;
		
		while(head != null){
			if(head.val == 0){
				if(temp != 0){
					node.next = new ListNode(temp);
					node = node.next;
				}
				temp = 0;
			} else{
				temp += head.val;
			}
			head = head.next;
		}
		
		return output.next;

    }
}