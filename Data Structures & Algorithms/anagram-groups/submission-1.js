class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const map = new Map() // sorted str : words[]

        for(const w of strs){
            const arr = new Array(26).fill(0)

            for(const l of w){
                arr[l.charCodeAt(0) - 'a'.charCodeAt(0)] += 1
            }

            const key = arr.join(",")

            if(!map[key]){
                map[key] = []
            }

            map[key].push(w)
        }
        return Object.values(map)
    }
}
