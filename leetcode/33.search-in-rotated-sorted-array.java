/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    // Self made
    // int getPivot(int[] nums) {
    //     int n = nums.length;
    //     int l = 0, r = n - 1, pivot = -1, mid;

    //     while(l<=r) {
    //         mid = (l+r)/2;
    //         if(mid+1<n && nums[mid] >= nums[mid+1]) {
    //             if(mid - 1 >= 0 && nums[mid-1] >= nums[mid]) return -1;
    //             if(mid + 2 < n && nums[mid+1] >= nums[mid+2]) return -1;
    //             return mid;
    //         }
    //         else if(nums[0] > nums[mid]) r = mid - 1;
    //         else if(nums[0] <= nums[mid]) l = mid + 1;
    //     }
    //     return -1;
    // }

    // int search(int[] nums,int l, int r, int target, boolean asc) {
    //     int mid = -1;
    //     while(l<=r) {
    //         mid = (l+r)/2;
    //         if(nums[mid] == target) return mid;
    //         else if(nums[mid] < target){
    //             if(asc) l = mid + 1;
    //             else r = mid - 1;
    //         } 
    //         else {
    //             if(asc) r = mid - 1;
    //             else l = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public int search(int[] nums, int target) {
    //     int n = nums.length;
    //     int l = 0, r = n - 1;

    //     if(n == 1) return nums[0] == target ? 0 : -1;

    //     int pivot = getPivot(nums);
    //     boolean asc = false;
    //     if(pivot == -1) {
    //         asc = nums[0] <= nums[1];
    //         return search(nums,0,n-1,target,asc);
    //     }
    //     else {
    //         if(nums[0] <= target && target <= nums[pivot]) {
    //             return search(nums,0,pivot,target,true);
    //         } else {
    //             return search(nums,pivot+1,n-1,target,true);
    //         }
    //     }
    // }

    //another modified single traversal
    // public int search(int[] nums, int target) {
    //     int low = 0, high = nums.length - 1;
    //     int ans = -1;
    //     while(low <= high) {
    //         int mid = low+(high-low)/2;
    //         if(nums[mid] == target) {
    //             ans = mid;
    //             break;
    //         }
    //         else if(nums[mid] >= nums[low]) {
    //             if(nums[low] <= target && target < nums[mid]) high = mid-1;
    //             else low = mid+1;
    //         }
    //         else {
    //             if(nums[mid] < target && target <= nums[high]) low = mid+1;
    //             else high = mid-1;
    //         }
    //     }
    //     return ans;
    // }

    //Modified rotation search approach
    int getMinIdx(int[] nums) {
        int l = 0, r = nums.length - 1,mid;
        while(l<r) {
            mid = l + (r-l)/2;
            if(nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
    public int search(int[] nums, int target) {
        int rot = getMinIdx(nums);
        int n = nums.length;
        int lo=0, hi=n-1, mid, realmid;
        // The usual binary search and accounting for rotation.
        while(lo <= hi){
            mid=(lo+hi)/2;
            realmid=(mid+rot)%n;
            if(nums[realmid]==target)return realmid;
            if(nums[realmid]<target)lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }

}
// @lc code=end

