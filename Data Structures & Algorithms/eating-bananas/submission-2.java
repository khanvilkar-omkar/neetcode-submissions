class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            long hoursNeeded = 0;

            for (int pile : piles) {
                // Ceiling division: ceil(pile / mid)
                hoursNeeded += (pile + mid - 1) / mid;
            }

            if (hoursNeeded <= h) {
                right = mid;       // mid works; look for a smaller speed
            } else {
                left = mid + 1;    // mid is too slow
            }
        }

        return left;
    }
}
