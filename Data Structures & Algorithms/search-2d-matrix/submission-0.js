class Solution {
    /**
     * @param {number[][]} matrix
     * @param {number} target
     * @return {boolean}
     */
    searchMatrix(matrix, target) {
        let rows = matrix.length
        let cols = matrix[0].length

        let left = 0
        let right = rows * cols - 1

        while(left <= right){
            const mid = Math.floor((left + right) / 2)
            let row = Math.floor(mid / cols)
            let col = mid % cols
            let value = matrix[row][col]

            if(value < target){
                left = mid + 1
            } else if(value > target){
                right = mid - 1
            } else {
                return true
            }

        }
        return false
    }
}
