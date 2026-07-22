class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l = 0;
        Set<Character> chars = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}
