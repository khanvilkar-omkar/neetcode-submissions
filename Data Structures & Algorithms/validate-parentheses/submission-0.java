class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for (Character charat : s.toCharArray()) {
            if (charat == '(') {
                chars.push(')');
            } else if (charat == '{') {
                chars.push('}');
            } else if (charat == '[') {
                chars.push(']');
            } else {
                if (chars.isEmpty() || chars.pop() != charat ) {
                    return false;
                }
            }
            
        }
        return chars.isEmpty();
    }
}
