/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA, ptr2 = headB;
        int n = 0, m = 0;
        while(ptr1 != null){ n++; ptr1 = ptr1.next;}
        while(ptr2 != null){ m++; ptr2 = ptr2.next;}
        
        ptr1 = headA;
        ptr2 = headB;
        
        while(n>m) {
            ptr1 = ptr1.next;
            n--;
        } 
        
        while(m>n) {
            ptr2 = ptr2.next;
            m--;
        }

        while(ptr1 != null && ptr2 != null) {
            if(ptr1 == ptr2) return ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }
}
// @lc code=end

