class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int diff = target - curr;

            if (hashMap.containsKey(diff)){
                return new int[] {hashMap.get(diff), i};
            }

            hashMap.put(curr, i);
        }

        return new int[] {};
    }
}
