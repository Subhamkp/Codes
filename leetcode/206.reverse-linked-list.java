/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    ListNode newHead = null;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        solve(head);

        return newHead;
    }

    ListNode solve(ListNode curr) {
        if(curr.next == null) {
            newHead = curr;
            return curr;
        }
        ListNode parent = solve(curr.next);

        parent.next = curr;    
        curr.next = null;
        return curr;
    }
}
// @lc code=end

