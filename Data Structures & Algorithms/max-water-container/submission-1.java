class Solution {
    public int maxArea(int[] heights) {
        // int ans = 0;
        // for (int left = 0; left < heights.length; left++) {
        //     int right = heights.length - 1;
        //     while (left < right) {
        //         int area = Math.min(heights[left], heights[right]) * (right - left);
        //         // System.out.println(area);
        //         ans = Math.max(ans, area);
        //         right--;
        //     }

        // }
        // return ans;

        int ans = 0;
        int left = 0;
        int right = heights.length - 1;
        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            ans = Math.max(area, ans);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
