/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
public class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0;
        int maxCount = 0;
        for(char task : tasks) {
            counter[task - 'A']++;
            if(max == counter[task - 'A']) {
                maxCount++;
            }
            else if(max < counter[task - 'A']) {
                max = counter[task - 'A'];
                maxCount = 1;
            }
        }
        //Here, n = 3, tasks=[AACCCDDEEE]
        // C   C   C
        // CE  CE  CE
        //partCount = Count of Gap between C or E = 2
        //Part length = Length of each Gap = Defined Gap - (Count of high Freq task - single task) = 3 - (2-1) = 2
        //availableTasks = All tasks - Occupies task by high freq tasks = 10 - 6 = 4
        //idles = left out by filling the gap with available task
        int partCount = max - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount; 
        int idles = Math.max(0, emptySlots - availableTasks);
        
        return tasks.length + idles;
    }
}
// @lc code=end

