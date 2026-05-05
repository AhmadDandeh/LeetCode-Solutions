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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode curr = head;
        int n = 1;
        while(curr.next != null){
            n++;
            curr = curr.next;
        }
        k %= n;
        if(k == 0) return head;
        curr.next = head;
        int rem = n-k-1;
        while(rem-- > 0) head = head.next;
        curr = head;
        head = head.next;
        curr.next = null;
        return head;
    }
}