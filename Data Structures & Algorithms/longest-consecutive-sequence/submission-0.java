class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            numbers.add(i);
        }

        for (int i : numbers) {
            int maxlength = 1;
            while (numbers.contains(i + 1)) {
                maxlength++;
                i++;
            }
            ans = Math.max(ans, maxlength);
        }

        return ans;
    }
}
