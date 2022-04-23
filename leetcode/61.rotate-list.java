/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null) return null;

        ListNode ptr = head;

        int len = 0;
        while(ptr != null) {
            len++;
            ptr = ptr.next;
        }

        k = k%len;

        ptr = null;
        ListNode newHead = head;
        for(int i=0;i<(len-k);i++) {
            ptr = newHead;
            newHead = newHead.next;
        }
        ptr.next = null;

        if(newHead != null) {    
            ptr = newHead;
            while(ptr.next != null) ptr = ptr.next;
            ptr.next = head;
            head = newHead;
        }

        return head;

    }
}
// @lc code=end

