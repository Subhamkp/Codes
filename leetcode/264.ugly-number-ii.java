/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        int[] a = new int[n];
        a[0]=1;
        int count_2=0;
        int count_3=0;
        int count_5=0;
        int next2=2;
        int next3=3;
        int next5=5;
        for(int i=1;i<n;i++){
            
            int mini=Math.min(next2,Math.min(next3,next5));
            a[i]=mini;
            
            if(mini==next2){
                count_2+=1;
                next2=a[count_2]*2;
            }
            
            if(mini==next3){
                count_3+=1;
                next3=a[count_3]*3;
            }
            
            if(mini==next5){
                count_5+=1;
                next5=a[count_5]*5;
            }
        }
        /*for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }*/
        return a[n-1];
        
    }
}
// @lc code=end

