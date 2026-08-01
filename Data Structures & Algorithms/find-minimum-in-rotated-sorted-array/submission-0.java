class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Keep searching until both pointers meet at the minimum.
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than right, minimum is to the right of mid.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, mid may be the minimum, so keep it.
                right = mid;
            }
        }

        return nums[left]; // left == right, pointing to the minimum element
    }
}
