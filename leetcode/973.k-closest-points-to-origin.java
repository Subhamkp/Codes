/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int l = 0, r = points.length - 1;

        while(l <= r) {
            int idx = partition(points,l,r);
            if(idx == (k-1)) break;
            else if(idx < k) {
                l = idx + 1;
            } else {
                r = idx - 1;
            }
        }

        int[][] res = new int[k][2];
        while (k - 1 >= 0) {
            res[k - 1] = points[k - 1];
            k--;
        }
        return res;
    }

    public int partition(int[][] p, int l, int r) {
        int pivot = (p[r][0]*p[r][0] + p[r][1]*p[r][1]);
        int prev = l;
        int[] temp;

        for (int i = l; i < r; i++) {
            if((p[i][0]*p[i][0] + p[i][1]*p[i][1]) < pivot) {
                //swap (i and prev)
                temp = p[i];
                p[i] = p[prev];
                p[prev] = temp;

                prev++;
            }
        }

        //swap (r and prev)
        temp = p[r];
        p[r] = p[prev];
        p[prev] = temp;

        return prev;
    }
}
// @lc code=end

