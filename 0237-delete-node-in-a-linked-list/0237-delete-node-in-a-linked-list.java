/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;//overwrite the value of next node to curr node that has to be deleted
        node.next = node.next.next;//delete it by successor node  
    }
}