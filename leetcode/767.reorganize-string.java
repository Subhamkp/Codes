/*
 * @lc app=leetcode id=767 lang=java
 *
 * [767] Reorganize String
 */

// @lc code=start
class Solution {
    // Consider this example: "aaabbbcdd", we will construct the string in this way:
    // a _ a _ a _ _ _ _ // fill in "a" at position 0, 2, 4
    // a b a _ a _ b _ b // fill in "b" at position 6, 8, 1
    // a b a c a _ b _ b // fill in "c" at position 3
    // a b a c a d b d b // fill in "d" at position 5, 7
    
    public String reorganizeString(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()) {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character,Integer>> ar = new ArrayList<>(mp.entrySet());
        Collections.sort(ar, (o1, o2) -> o2.getValue() - o1.getValue());
        
        char k;
        int v = 0, counter = mp.size(), j 0;

        int n = s.length();
        char[] res = new char[n];


        //First even and then odd entering to res
        //Break when adjacent are same; 
        for(int i=0;i<ar.size();i++) {
            Map.Entry<Character,Integer> e = ar.get(i);
            k = e.getKey();
            v = e.getValue();

            while(v > 0) {
                //Break condition
                if(j != 0 && res[j-1] == k) return "";

                //add character at 2 distance (at even or odd index)
                res[j] = k;
                v--;
                j+=2;
                
                //Even iteration excced the limit, navigate to odd index
                if(j%2 == 0 && j > n - 1) j = 1;
            }
        }

        String ans = "";
        for(int i=0;i<n;i++) {
            ans+=res[i];
        }
        return ans;
    }
}
// @lc code=end

