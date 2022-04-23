/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
class MyHashSet {

    GenericHashSet<Integer> hst;
    public MyHashSet() {
        hst = new GenericHashSet<Integer>(2000);
    }
    
    public void add(int key) {
        hst.add(key);
    }
    
    public void remove(int key) {
        hst.remove(key);
    }
    
    public boolean contains(int key) {
        return hst.contains(key);
    }


    class GenericHashSet<K> {
            class ListNode<K,Boolean> {
                K key;
                Boolean val;
                ListNode<K,Boolean> next;

                ListNode(K key, Boolean val) {
                    this.key = key;
                    this.val = val;
                }
            }

            final ListNode<K,Boolean>[] nodes;

            GenericHashSet(int capacity) {
                nodes = new ListNode[capacity];
            }


            public void add(K key) {
                int index = findIndex(key);
                if(nodes[index] == null){
                    nodes[index] = new ListNode(new Object(),new Object());
                }
                ListNode<K,Boolean> prev = findPrev(nodes[index],key);
                if(prev.next == null){
                    prev.next = new ListNode(key,true);
                }else{
                    //Already present
                }

            }

            public void remove(K key){
                int index = findIndex(key);
                if(nodes[index] == null){
                    return;
                }
                ListNode<K,Boolean> prev = findPrev(nodes[index],key);
                if(prev.next == null){
                    return;
                }
                prev.next = prev.next.next;
            }

            public boolean contains(K key){
                int index = findIndex(key);
                if(nodes[index] == null){
                    return false;
                }
                ListNode<K,Boolean> node = findPrev(nodes[index],key);
                if(node.next == null){
                    return false;
                }else{
                    return node.next.val;
                }
            }

            
            private ListNode<K,Boolean> findPrev(ListNode<K,Boolean> node, K key){
                ListNode<K,Boolean> bucket = node, prev = null;
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
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

