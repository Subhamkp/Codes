/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     List<List<String>> res = new ArrayList<>();
        
    //     HashMap<String,List<String>> comp = new HashMap<>();
    //     for(String s : strs) {
    //         String temp = compute(s);
    //         List<String> ar = comp.getOrDefault(temp,new ArrayList<>());
    //         ar.add(s);
    //         comp.put(temp,ar);
    //     }

    //     for(Map.Entry<String,List<String>> e : comp.entrySet()) {
    //         res.add(e.getValue());
    //     }
    //     // System.out.println("res : "+res.size());
    //     return res;
    // }

    // String compute(String s) {
    //     TreeMap<Character,Integer> mp = new TreeMap<>();
    //     for(char c : s.toCharArray()) {
    //         mp.put(c,mp.getOrDefault(c,0)+1);
    //     }

    //     StringBuilder sb = new StringBuilder();
    //     for(Map.Entry<Character,Integer> e : mp.entrySet()) {
    //         sb.append(e.getKey()).append(e.getValue()).append("#");
    //     }
    //     return sb.toString();
    // }


    // OR

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end

