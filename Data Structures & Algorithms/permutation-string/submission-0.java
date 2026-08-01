class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        if (s1.length() == 0) {
            return true;
        }
        int[] s1arr = new int[26];
        int[] s2arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1arr[s1.charAt(i) - 'a']++;
            s2arr[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(s1arr, s2arr)) {
                return true;
            }
            s2arr[s2.charAt(i - s1.length()) - 'a']--;
            s2arr[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1arr, s2arr)) {
            return true;
        } else {
            return false;
        }
    }
}
