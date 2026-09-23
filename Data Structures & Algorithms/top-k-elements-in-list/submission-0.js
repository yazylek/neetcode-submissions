class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const numsMap = new Map()

        for (let i = 0; i < nums.length; i++) {
            if (numsMap.has(nums[i])) {
                numsMap.set(nums[i], (numsMap.get(nums[i]) || 0) + 1)
            } else {
                numsMap.set(nums[i], 1)
            }
        }

        const sorted = Array.from(numsMap).sort((a, b) => b[1] - a[1]).slice(0, k).map(([a, _]) => a)
        return sorted
    }

}
