/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();

        HashMap<Character,ArrayList<Integer> > mp = new HashMap<>();
        ArrayList<Integer> temp;
        for(int i=0;i<n;i++) {
            temp = mp.getOrDefault(t.charAt(i),new ArrayList());
            temp.add(i);
            mp.put(t.charAt(i),temp);
        }

        int prevIdx = -1, idx;
        for(int i=0;i<m;i++) {
            temp = mp.getOrDefault(s.charAt(i),new ArrayList());

            if(temp.size() == 0) return false;
            idx = customSearch(temp,prevIdx);
            if(idx != -1) prevIdx = idx;
            else return false;
        }
        return true;
    }

    int customSearch(ArrayList<Integer> ar, int x) {
        int l = 0;
        int r = ar.size() - 1, mid = -1;
        int res = -1;
        while(l<=r) {
            mid = l + ((r-l) >> 1);
            if(ar.get(mid) > x) {
                res = ar.get(mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
// @lc code=end

