class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        const numsSet = new Set()
        for(let i = 0; i < nums.length; i++){
            const diff = target - nums[i]

            if(numsSet.has(diff)){
                return [Math.min(i, nums.indexOf(diff)), Math.max(i, nums.indexOf(diff))]
            }

            numsSet.add(nums[i])
        }
        return []
    }
}
