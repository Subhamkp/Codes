/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] lastIndex = new int[26];
        for(int i = 0;i<S.length();i++){
            // We store the last occurance of each occuring character.
            lastIndex[S.charAt(i)-'a'] = i;
        }
        
        List<Integer> partitions = new ArrayList<>();
        int i = 0;
        while(i<S.length()){
            //We use the Last Index array to find the last occurance
            //of each character from the start.
            int end = lastIndex[S.charAt(i) - 'a'];
            int j = i;
            while(j!=end){
                //This is kind of Intuituve now
                //Check in the range [j,end] such that any element in between has lastIndex > end 
                // If so, then update the end and repeat
                end = Math.max(end,lastIndex[S.charAt(j++)-'a']);
            }
            partitions.add(j-i+1);
            i = j+1;
        }
        return partitions;
    }
}
// @lc code=end

