class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const stack = []
        const schema = {
            ")": "(",
            "]": "[",
            "}": "{"
        }

        for(const p of s) {
            if(schema[p]){
                if(stack.length > 0 && stack[stack.length - 1] === schema[p]){
                    stack.pop()
                } else {
                    return false
                }
            } else {
                stack.push(p)
            }
        }

            return stack.length === 0
       
    }
}
