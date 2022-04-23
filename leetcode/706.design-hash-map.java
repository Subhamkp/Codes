/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start

class MyHashMap {

    GenericHashMap<Integer,Integer> mp;
    public MyHashMap() {
         mp = new GenericHashMap(1000);
    }
    
    public void put(int key, int value) {
        mp.put(key,value);
    }
    
    public int get(int key) {
        Object res = mp.get(key);
        if(res == null) return -1;
        else return (int)res;
    }
    
    public void remove(int key) {
        mp.remove(key);
    }

    class GenericHashMap<K,V> {
            class ListNode<K,V> {
                K key;
                V val;
                ListNode<K,V> next;

                ListNode(K key, V val) {
                    this.key = key;
                    this.val = val;
                }
            }

            final ListNode<K,V>[] nodes;

            GenericHashMap(int capacity) {
                nodes = new ListNode[capacity];
            }

            public void put(K key, V value){
                int index = findIndex(key);
                if(nodes[index] == null){
                    nodes[index] = new ListNode(new Object(),new Object());
                }
                ListNode<K,V> prev = findPrev(nodes[index],key);
                if(prev.next == null){
                    prev.next = new ListNode(key,value);
                }else{
                    prev.next.val = value;
                }
            }

            public V get(K key){
                int index = findIndex(key);
                if(nodes[index] == null){
                    return null;
                }
                ListNode<K,V> node = findPrev(nodes[index],key);
                if(node.next == null){
                    return null;
                }else{
                    return node.next.val;
                }
            }

            public void remove(K key){
                int index = findIndex(key);
                if(nodes[index] == null){
                    return;
                }
                ListNode<K,V> prev = findPrev(nodes[index],key);
                if(prev.next == null){
                    return;
                }
                prev.next = prev.next.next;
            }

            private ListNode<K,V> findPrev(ListNode<K,V> node, K key){
                ListNode<K,V> bucket = node, prev = null;
                while(bucket != null && !bucket.key.equals(key)) {
                    prev = bucket;
                    bucket = bucket.next;
                }
                return prev;
            }

            private int findIndex(K key){
                return key.hashCode() % nodes.length;
            }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

