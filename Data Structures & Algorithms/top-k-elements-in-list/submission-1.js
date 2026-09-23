class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const map = new Map()
        const res = []
        for(const n of nums){
            map.set(n , (map.get(n) || 0) + 1)
        }

        const sortedArr = Array.from(map.entries()).sort((a, b) => b[1] - a[1])

        return sortedArr.slice(0, k).map(e => e[0])
    }
}
