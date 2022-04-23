/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {

    List<List<Integer>> res;
    int[] in;
    List<Integer> ar;

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        res = new ArrayList<>();
        ar = new ArrayList<>();
        Arrays.sort(nums);


        in = nums;

        solve(0,target);

        return res;
    }

    void solve(int idx, int target) {

        if(target < 0) {
            return;
        }

        if(target == 0) {
            res.add(new ArrayList<>(ar));
            return;
        }

        for(int i=idx;i<in.length;i++) {
            

            if(i>idx && (in[i] == in[i-1])) 
                continue; //skip if curr and prev are equal and both not been used
                //In other works, take values if a) !used(curr) and used(prev) b) !used(curr) and curr != prev 
                        
            ar.add(in[i]);
            
            solve(i+1, target - in[i]);
            
            ar.remove(ar.size()-1);
        }
    }
}
// @lc code=end

