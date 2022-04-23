/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = newHead;

        while(head != null) {
            if(ptr.val != head.val) {
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

