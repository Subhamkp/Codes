/*
 * @lc app=leetcode id=797 lang=java
 *
 * [797] All Paths From Source to Target
 */

// @lc code=start
class Solution {

    List<Integer> temp;
    List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        temp = new ArrayList<>();
        res = new ArrayList<>();
        temp.add(0);
        solve(graph,0);
        return res;
    }

    public void solve(int[][] graph, int start) {

        if(start == graph.length - 1) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int x : graph[start]) {
            temp.add(x);
            solve(graph,x);
            temp.remove(temp.size() - 1);
        }
    }
}
// @lc code=end

