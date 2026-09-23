class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> counter = new HashSet<>();
        for (int val : nums){
            if (counter.contains(val)){
                return true;
            } else {
                counter.add(val);
            }
        }
            return false;
    }
}