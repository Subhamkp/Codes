/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1, ptr2 = list2;
        ListNode newHead = new ListNode(-1);
        ListNode ptr = newHead;

        while(ptr1 != null && ptr2 != null) {
            if(ptr1.val <= ptr2.val) {
                ptr.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                ptr.next = ptr2;
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
        }
        if(ptr1 != null) ptr.next = ptr1;
        if(ptr2 != null) ptr.next = ptr2;

        return newHead.next;
    }
}
// @lc code=end

