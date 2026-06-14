class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (index.containsKey(diff)) {
                return new int[] { index.get(diff), i };
            } else {
                index.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
