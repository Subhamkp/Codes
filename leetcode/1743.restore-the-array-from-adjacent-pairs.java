/*
 * @lc app=leetcode id=1743 lang=java
 *
 * [1743] Restore the Array From Adjacent Pairs
 */

// @lc code=start
class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer,ArrayList<Integer>> mp = new HashMap<>();
        for(int[] row : adjacentPairs) {
            mp.putIfAbsent(row[0],new ArrayList<>());
            mp.putIfAbsent(row[1],new ArrayList<>());
            mp.get(row[0]).add(row[1]);
            mp.get(row[1]).add(row[0]);
        }

        int start = -1, idx = 0, n = mp.size();
        for(int x : mp.keySet()) {
            if(mp.get(x).size() == 1) {
                start = x;
                break;
            }
        }
        // System.out.println("mp : "+mp);
        // System.out.println("start : "+start);
        int[] res = new int[n];
        res[idx++] = start;

        while(idx < n) {
            for(int x : mp.get(start)) {
                // System.out.print(mp.get(start)+" ");
                if(mp.containsKey(x)) {
                    res[idx++] = x;
                    mp.remove(start);
                    start = x;
                    break;
                }
            }
            // System.out.println(" : "+"nextline");
        }
        return res;
    }
}
// @lc code=end

