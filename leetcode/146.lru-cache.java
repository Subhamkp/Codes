/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache {

    class Node {
        int val,key;
        Node next, prev;
        Node(int key, int val) {
            this.val = val;
            this.key = key;
        }
    }
    
    Node head = null, tail = null, leastRecentlyUsed = null;
    Node[] mp;
    int CAPACITY = -1;
    public LRUCache(int capacity) {
        CAPACITY = capacity;
        
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        
        mp = new Node[10005];
    }
    
    public int get(int key) {
        if(mp[key] == null) return -1;
        else {
            mp[key].prev.next = mp[key].next;
            mp[key].next.prev = mp[key].prev;
                
            head.next.prev = mp[key];
            mp[key].next = head.next; 
            mp[key].prev = head;
            head.next = mp[key];
            
            return mp[key].val;
        }
    }
    
    public void put(int key, int value) {

        if(mp[key] != null) {
            mp[key].val = value;
            
            mp[key].prev.next = mp[key].next;
            mp[key].next.prev = mp[key].prev;
            
            head.next.prev = mp[key];
            mp[key].next = head.next; 
            mp[key].prev = head;
            head.next = mp[key];
            
        } else {
            
            if(CAPACITY == 0) {
                leastRecentlyUsed = tail.prev;
                leastRecentlyUsed.prev.next = tail;
                tail.prev = leastRecentlyUsed.prev;
                
                mp[leastRecentlyUsed.key] = null;
                leastRecentlyUsed.val = value;
                leastRecentlyUsed.key = key;
                mp[key] = leastRecentlyUsed;
                
                head.next.prev = leastRecentlyUsed;
                leastRecentlyUsed.next = head.next; 
                leastRecentlyUsed.prev = head;
                head.next = leastRecentlyUsed;

            } else {
                Node temp = new Node(key,value);
                
                head.next.prev = temp;
                temp.next = head.next; 
                temp.prev = head;
                head.next = temp;
                
                mp[key] = temp;
                
                CAPACITY--;
            }
            

        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

