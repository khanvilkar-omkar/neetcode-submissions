class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniquSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniquSet.contains(nums[i])) {
                return true;
            }
            uniquSet.add(nums[i]);
        }
        return false;
    }
}