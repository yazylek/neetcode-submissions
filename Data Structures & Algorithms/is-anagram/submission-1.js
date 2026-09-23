class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length !== t.length) return false
        const freqS = new Map()

        for(const ch of s){
            freqS.set(ch, (freqS.get(ch) || 0) + 1)
        }

        for(const ch of t){
            if(freqS.get(ch) > 0){
                freqS.set(ch, (freqS.get(ch) || 0) - 1)
            } else {
                return false
            }
        }

        return true

    }
}
