/*
 * @lc app=leetcode id=210 lang=java
 *
 * [210] Course Schedule II
 */

// @lc code=start
class Solution {
    List<Integer> adj[];
    HashMap<Integer,Integer> vis;
    int[] res;
    int idx;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //0 -> 1 ,2
        //2 -> 3
        //1 -> 3

        //3 1 2 0
        //3 2 1 0
        adj = new ArrayList[numCourses];
        vis = new HashMap<>();
        for(int i=0;i<numCourses;i++) {
            vis.put(i,0); //0 -> unvisited, 1 -> visiting, 2 -> visited
            adj[i] = new ArrayList<>();
        }

        for(int[] row : prerequisites) {
            adj[row[1]].add(row[0]);
        }

        
        res = new int[numCourses];
        idx = numCourses - 1;
        for(int i=0;i<numCourses;i++) {
            if(vis.get(i) == 0) {
                if(dfs(i) == false) return new int[0];
            }
        }
        return res;
    }

    boolean dfs(int p) {
        vis.put(p,1);
        for(int x : adj[p]) {
            if(vis.get(x) == 0) {
                if(dfs(x) == false) return false;;
            } else if(vis.get(x) == 1) {
                return false; //Double revisiting
            }
        }
        vis.put(p,2); //Indicated that p is in resultant array and no visit
        res[idx--] = p;
        return true;
    }
}
// @lc code=end

