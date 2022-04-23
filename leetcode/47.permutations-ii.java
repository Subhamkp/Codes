/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res;
    int[] in;
    List<Integer> ar;
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        ar = new ArrayList<>();
        used = new boolean[nums.length];

        Arrays.sort(nums);

        in = nums;

        solve();

        return res;
    }

    void solve() {

        if(ar.size() == in.length) {
            res.add(new ArrayList<>(ar));
             
        }

        for(int i=0;i<in.length;i++) {
            

            if(used[i] || (i>0 && (in[i] == in[i-1]) && !used[i-1] )) 
                continue; //skip if curr and prev are equal and both not been used
                //In other works, take values if a) !used(curr) and used(prev) b) !used(curr) and curr != prev 
            
            
            ar.add(in[i]);
            used[i] = true;

            
            
            solve();
            
            ar.remove(ar.size()-1);
            used[i] = false;

        }
    }
}
// @lc code=end

