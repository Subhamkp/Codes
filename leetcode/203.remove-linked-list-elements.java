/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        ListNode ptr = newHead;

        while(head != null) {
            if(head.val != val) {
                ptr.next = head;
                ptr = ptr.next;
                head = head.next;
            } else {
                ptr.next = null;
                head = head.next;
            }
        }
        return newHead.next;
    }
}
// @lc code=end

