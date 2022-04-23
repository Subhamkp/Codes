/*
 * @lc app=leetcode id=787 lang=java
 *
 * [787] Cheapest Flights Within K Stops
 */

// @lc code=start
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) 
    {
        Map<Integer, List<int[]> > map = new HashMap<>();
        for(int[] f:flights)
        {
            map.putIfAbsent(f[0],new ArrayList<>());
            map.get(f[0]).add(new int[]{f[1],f[2]});
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        q.offer(new int[]{0,src,K+1});

        int[][] distCost = new int[n][K+2];
        for(int[] ar : distCost) Arrays.fill(ar,Integer.MAX_VALUE);

        while(!q.isEmpty())
        {
            int[] c = q.poll();
            int cost=c[0];
            int curr=c[1];
            int stop=c[2];

            if(curr == dst)
                return cost;
            
            if(stop > 0)
            {
                if(map.containsKey(curr)) 
                {
                    for(int[] next : map.get(curr))
                    {
                        if(distCost[next[0]][stop-1] > cost+next[1]) {
                            distCost[next[0]][stop-1] = cost+next[1];
                            q.add(new int[]{cost+next[1],next[0],stop-1});
                        }
                    }
                }
            }
        }
        return -1;
    }
}
// @lc code=end

