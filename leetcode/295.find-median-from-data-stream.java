/*
 * @lc app=leetcode id=295 lang=java
 *
 * [295] Find Median from Data Stream
 */

// @lc code=start
class MedianFinder {
    PriorityQueue<Integer> lower, upper;
    private boolean even = true;
    
    public MedianFinder() {
        lower = new PriorityQueue<>((a,b) -> b - a); //return max on peek
        upper = new PriorityQueue<>((a,b) -> a - b); //return min on peek
    }
    
    //1 5 4 7 9
    // lower half (mx) 1 4
    // upper half (mn) 9 7 5 
    //Always try to maintain half
    public void addNum(int num) {
        if(even) {
            lower.add(num);
            upper.add(lower.poll());
        }
        else {
            upper.add(num);
            lower.add(upper.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if(even) return (lower.peek() + upper.peek())/2.0;
        else return upper.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
// @lc code=end

