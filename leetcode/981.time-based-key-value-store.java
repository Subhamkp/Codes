/*
 * @lc app=leetcode id=981 lang=java
 *
 * [981] Time Based Key-Value Store
 */

// @lc code=start
class TimeMap {

    HashMap<String,ArrayList<String[]> > mp;
    public TimeMap() {
        mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<String[]> temp = mp.getOrDefault(key,new ArrayList<>());
        temp.add(new String[]{value,timestamp+""});
        mp.put(key,temp);
    }
    
    public String get(String key, int timestamp) {
        ArrayList<String[]> temp = mp.getOrDefault(key,new ArrayList<>());

        int l = 0, r = temp.size() - 1, mid = -1;
        String ans = "";
        while(l<=r) {
            mid = (l+r)/2;
            String[] e = temp.get(mid);
            if(Integer.valueOf(e[1]) <= timestamp) {
                ans = e[0];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
// @lc code=end

