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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstC = -1, prevC = -1, min = Integer.MAX_VALUE;
        int index = 0;
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null && curr.next != null){
            index++;
            if((prev.val < curr.val && curr.next.val < curr.val)
            || (prev.val > curr.val && curr.next.val > curr.val)
            ){
                if(firstC == -1){
                    firstC = index;
                    prevC = index;
                }
                else{
                    min = Math.min(min, index - prevC);
                    prevC = index;
                }
            }
            prev = curr;
            curr = curr.next;
        }

        int[] ans = new int[2];
        if(firstC == -1 || firstC == prevC){
            return new int[]{-1, -1};
        }
        return new int[]{min, prevC - firstC};
    }
}