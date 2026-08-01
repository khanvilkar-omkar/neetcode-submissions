class Solution {
    public boolean isValid(String s) {
        Stack<Character> signs = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '[') {
                signs.push(']');
            } else if (c == '{') {
                signs.push('}');
            } else if (c == '(') {
                signs.push(')');
            } else {
                if (signs.isEmpty() || signs.pop() != c) {
                    return false;
                }
            }
        }
        return signs.isEmpty();
    }
}
