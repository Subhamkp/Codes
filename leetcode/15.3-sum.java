/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    int n;
    public List<List<Integer>> threeSum(int[] num) {
        n = num.length;
        Arrays.sort(num);
        return kSum(num,0,3,0);
    }

    private List<List<Integer>> kSum(int[] nums, int target, int k, int index) {
        List<List<Integer>> res = new ArrayList<>();
        if(index >= n) return res;

        if(k == 2) {
            //count 2 pair solution
            int l = index, r = n-1, tempSum;
            while(l<r) {
                tempSum = nums[l]+nums[r];
                if(tempSum == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[l]);
                    temp.add(target-nums[l]);
                    res.add(temp);
                    //skip duplication
                    while(l<r && nums[l]==nums[l+1]) l++;
                    while(l<r && nums[r-1]==nums[r]) r--;
                    l++;
                    r--;
                } else if(tempSum < target) l++;
                else r--;
            }
        } else {
            for(int i=index;i<n-k+1;i++) {
                //use current number to reduce ksum into k-1 sum
                List<List<Integer>> temp = kSum(nums, target - nums[i], k-1, i+1);
                if(temp != null){
                    //add previous results
                    for (List<Integer> t : temp) {
                        t.add(0, nums[i]);
                    }
                    res.addAll(temp);
                }
                while (i < n-1 && nums[i] == nums[i+1]) {
                    //skip duplicated numbers with i
                    i++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

