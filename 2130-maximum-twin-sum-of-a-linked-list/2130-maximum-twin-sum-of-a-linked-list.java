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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, prev = null, cur = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            cur.next = prev;
            prev = cur;
            cur = slow;
        }
        int max = Integer.MIN_VALUE;
        while(slow != null){
            max = Math.max(max, slow.val + prev.val);
            slow = slow.next;
            prev = prev.next;
        }
        return max;
    }
}