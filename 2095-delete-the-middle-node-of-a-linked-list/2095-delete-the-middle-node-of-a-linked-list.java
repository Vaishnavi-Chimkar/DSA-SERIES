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
    public static ListNode head;
    public static ListNode tail;
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null){
            head = tail = null;
            return head;
        }

        int sz = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        int i = 1;
        ListNode prev = head;
        while(i<sz/2){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}