/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    void print(int[] num) {
        for(int n : num) System.out.println(n);
        System.out.println();
    } 

    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1, p = 0;
        k = nums.length - k;
        while(left <= right) {
            p = partition(nums,left,right);
            //print(nums);
            if(p < k) 
                left = p + 1;
            else if(p > k)
                right = p - 1;
            else 
                break; //pivot at the kth largest
        }
        return nums[p];
    }

    //Princeton Algorithms i.e partition such that [low,i] < pivot, and pivot < [i+1,high]
    public int partition(int[]nums, int low, int high) {
        int pivot = nums[high];
        int i = low;
        for(int j=low;j<high;j++) {
            if(nums[j] <= pivot) {
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,high);
        return i;
    }

    public void swap(int[] nums, int x, int y) {
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
}
// @lc code=end

