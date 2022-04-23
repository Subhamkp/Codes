/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start
class RandomizedSet {

    int[] ar;
    HashMap<Integer,Integer> mp;
    Random r;
    int size = -1;
    public RandomizedSet() {
        ar = new int[200005];
        mp = new HashMap<>();
        r = new Random();
    }
    
    public boolean insert(int val) {
        if(mp.getOrDefault(val,-1) != -1) {
            return false;
        } else {
            size++;
            ar[size] = val;
            mp.put(val,size);
            return true;
        }


    }
    
    public boolean remove(int val) {
        if(mp.getOrDefault(val,-1) != -1) {
            int idx = mp.get(val);
            ar[idx] = ar[size];
            mp.put(ar[size],idx);
            mp.put(val,-1);
            size--;
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom() {
        return ar[r.nextInt(size + 1)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

