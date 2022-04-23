/*
 * @lc app=leetcode id=1451 lang=java
 *
 * [1451] Rearrange Words in a Sentence
 */

// @lc code=start
class Solution {
    public String arrangeWords(String text) {
        String[] texts = text.split(" ");
        texts[0] = texts[0].substring(0, 1).toLowerCase() + texts[0].substring(1);
        Arrays.sort(texts,(a,b) -> a.length() - b.length());
        texts[0] = texts[0].substring(0, 1).toUpperCase() + texts[0].substring(1);
        return String.join(" ", texts);
    }
}
// @lc code=end

