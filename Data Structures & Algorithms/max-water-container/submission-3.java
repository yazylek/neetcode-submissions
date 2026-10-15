class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxSum = 0;

        while (left < right) {
            int curSum = 0;
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);

            curSum = width * height;

            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
