class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> chars = new HashMap<>();
        int l = 0, maxf = 0;
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            chars.put(s.charAt(r), chars.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, chars.get(s.charAt(r)));

            while ((r - l + 1) - maxf > k) {
                chars.put(s.charAt(l), chars.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
