/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, carry = 0, temp;
        ListNode head = l1, prev = null;;
        while(l1 != null || l2 != null ) {

            if(l1 != null && l2 != null) {
                
                temp = l1.val + l2.val + carry;
                if(temp > 9) {
                    carry = 1;
                    temp = temp % 10;
                } else carry = 0;
                l1.val = temp;
                prev = l1;
                l1 = l1.next;
                l2 = l2.next;

            } else if(l1 != null) {

                temp = l1.val + carry;
                if(temp > 9) {
                    carry = 1;
                    temp = temp % 10;
                } else carry = 0;
                l1.val = temp;
                prev = l1;
                l1 = l1.next;

            } else if(l2 != null) {
                prev.next = l2;
                l1 = l2;
                l2 = null;
            }
        }

        if(carry != 0 && prev != null) {
            prev.next = new ListNode(1);
        }

        
        return head;
    }
}
// @lc code=end

