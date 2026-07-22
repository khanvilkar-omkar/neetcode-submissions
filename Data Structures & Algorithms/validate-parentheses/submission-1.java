class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (int point = 0; point < s.length(); point++) {
            if (s.charAt(point) == '(') {
                chars.push(')');
            } else if (s.charAt(point) == '[') {
                chars.push(']');
            } else if (s.charAt(point) == '{') {
                chars.push('}');
            } else {
                if (chars.isEmpty() || chars.pop() != s.charAt(point)) {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }
}
