class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let str = ''
        for(const s of strs){
            str += s.length + "#" + s
        }
        console.log(str)
            return str 
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        const arr = []
        let i = 0
        while(i < str.length){
            let j = i
            while(str[j] !== "#"){
                j++
            }
            let length = Number(str.substring(i, j))
            i = j + 1
            j = i + length
            arr.push(str.substring(i, j))
            i = j
        }
        
        return arr
    }
}
