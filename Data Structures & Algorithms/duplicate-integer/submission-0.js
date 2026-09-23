class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const sorted = nums.sort((a, b) => a - b)
        for(let i = 1; i < sorted.length; i++){
            if(nums[i] === nums[i - 1]){
                return true
            }
        }
    return false
    }
}
