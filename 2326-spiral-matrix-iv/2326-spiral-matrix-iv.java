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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int chk = m * n;
        int c = 0, r = 0, cnt = 0;
        int output[][] = new int[m][n];
		
        ListNode node = head;
		
        while(cnt < chk){
            for(int i = c; i < n; i++){
                if(node != null){
                    output[r][i] = node.val;
                    node = node.next;
                }else{
                    output[r][i] = -1;
                }
                cnt++;
            } 
            r++;
            if(cnt == chk) break;
			
            for(int i = r; i < m; i++){
                if(node != null){
                    output[i][n - 1] = node.val;
                    node = node.next;
                }else{
                    output[i][n - 1] = -1;
                }
                cnt++;
            }
            n--;
            if(cnt == chk) break;
			
            for(int i = n - 1; i >= c; i--){
                if(node != null){
                    output[m - 1][i] = node.val;
                    node = node.next;
                }else{
                    output[m - 1][i] = -1;
                }
                cnt++;
            }
            m--;
            if(cnt == chk) break;
			
            for(int i = m - 1; i >= r; i--){
                if(node != null){
                    output[i][c] = node.val;
                    node = node.next;
                }else{
                    output[i][c] = -1;
                }
                cnt++;
            }
            c++;
            
        }
		
        return output;
    }
}