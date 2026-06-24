class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] ans = new int[2];
        // int l = 0;
        // int r = numbers.length - 1;
        // while (l < r) {
        //     int sum = numbers[l] + numbers[r];
        //     if (sum > target) {
        //         r--;
        //     } else if (sum < target) {
        //         l++;
        //     } else {
        //         ans[0] = numbers[l];
        //         ans[1] = numbers[r];
        //         return ans;
        //     }
        // }

        // return ans;

        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[0];
    }
}
