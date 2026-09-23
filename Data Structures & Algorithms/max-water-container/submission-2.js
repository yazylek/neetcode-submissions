class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let left = 0
        let right = heights.length - 1
        let best = 0

        while (left < right) {
            let currBest = 0
            const formula = (right - left) * Math.min(heights[left], heights[right])

            currBest = formula
            best = Math.max(currBest, best)

            if (Math.min(heights[left], heights[right]) === heights[left]) {
                left++
            } else if (Math.min(heights[left], heights[right]) === heights[right]) {
                right--
            }


        }
        return best
    }
}
