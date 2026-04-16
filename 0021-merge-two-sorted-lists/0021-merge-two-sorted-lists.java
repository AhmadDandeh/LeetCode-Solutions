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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }

        ListNode start;
        if(list1.val <= list2.val){
            start = list1;
            list1 = list1.next;
        }
        else{
            start = list2;
            list2 = list2.next;
        }

        ListNode small = start;
        while(true){
            if(list1 == null){
                small.next = list2;
                break;
            }

            if(list2 == null){
                small.next = list1;
                break;
            }

            if(list1.val <= list2.val){
                small.next = list1;
                small = list1;
                list1 = list1.next;
            }
            else{
                small.next = list2;
                small = list2;
                list2 = list2.next;
            }
        }

        return start;
    }
}