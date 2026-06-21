class Solution {

   /**
     * Encode and Decode Strings
     * 
     * @param strs
     * @return
     */
    public static String encode(List<String> strs) {
        StringBuilder decodeString = new StringBuilder();
        for (String s : strs) {
            decodeString.append(s.length()).append('#').append(s);
        }
        return decodeString.toString();

    }

    /**
     * Same as a above function problem: Encode and Decode Strings
     * 
     * @param str
     * @return
     */
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
