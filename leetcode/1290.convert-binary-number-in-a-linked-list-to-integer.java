/*
 * @lc app=leetcode id=1290 lang=java
 *
 * [1290] Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        ListNode ptr = head;
        
        int res = 0;
        while(ptr != null) {
            res = res*2 + ptr.val;
            ptr = ptr.next;
        }
        return res;
    }
}
// @lc code=end

