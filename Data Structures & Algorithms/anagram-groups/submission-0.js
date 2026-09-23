class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const arr = strs.map((el) => el.split("").sort().join(""))
        const strMap = new Map()

        for (let i = 0; i < strs.length; i++) {
            if (strMap.has(arr[i])) {
                strMap.get(arr[i]).push(strs[i])
            } else {
                strMap.set(arr[i], [strs[i]])
            }
        }
        return Array.from(strMap.values())
    }
}
