/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode prev = head, curr = head, prevP = null;
        while (--n > 0 && curr != null) curr = curr.next;
        while (curr != null && curr.next != null) {
            curr = curr.next;
            prevP = prev;
            prev = prev.next;
        }
        if (prevP == null) {
            head = head.next;
        } else {
            prevP.next = prev.next;
        }
        return head;
    }
}
// @lc code=end

