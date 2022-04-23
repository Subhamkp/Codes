/*
 * @lc app=leetcode id=307 lang=java
 *
 * [307] Range Sum Query - Mutable
 */

// @lc code=start
class NumArray {

    int[] tree;
    int N;
    public NumArray(int[] nums) {
        N = nums.length;
        tree = new int[2*N];

        for(int i=0;i<N;i++) tree[i+N] = nums[i];

        for(int i = N-1; i>0; i>>=1) {
            tree[i] = tree[i<<1] + tree[i<<1 | 1];
        }


    }
    
    public void update(int index, int val) {
        for(tree[index+=N]=val;index > 1;index>>=1) {
            tree[index>>1] = tree[index] + tree[index^1];
        }
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
        for(left+=N,right+=(1+N);left<right;left>>=1,right>>=1) {
            if(left%2 == 1) res = res + tree[left++];
            if(right%2 == 1) res = res + tree[--right];
        }
        return res;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
// @lc code=end

