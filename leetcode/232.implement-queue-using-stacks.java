/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {

    Stack<Integer> st1, st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    // remove 1 2 3 4 5 6 add
    public void push(int x) {
        while(!st1.isEmpty()) st2.push(st1.pop());
        st1.push(x);
        while(!st2.isEmpty()) st1.push(st2.pop());
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

