class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const map = new Map()

        for(const n of nums){
            map.set(n, (map.get(n) || 0) + 1)
        }
        const resArr = Array.from(map.entries()).sort((a, b) => b[1] - a[1]).map(n => n[0]).slice(0, k)
        return resArr
    }
}
