/*
 * @lc app=leetcode id=535 lang=java
 *
 * [535] Encode and Decode TinyURL
 */

// @lc code=start
public class Codec {

    HashMap<String,String> mp = new HashMap<>();
    long compute_hash(String s) {
        int p = 31;
        long m = 1000000007;
        long hash_value = 0;
        long p_pow = 1;
        for (char c : s.toCharArray()) {
            hash_value = (hash_value + (c - 'a' + 1) * p_pow) % m;
            p_pow = (p_pow * p) % m;
        }
        return hash_value;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String compute_hash) {
        long hash = compute_hash(compute_hash);
        mp.put(hash+"",compute_hash);
        return hash+"";
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mp.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
// @lc code=end

