class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> indexes = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes.add(i);
                    indexes.add(j);
                }
            }
        }
        Collections.sort(indexes);
        return indexes.stream().mapToInt(e -> e.intValue()).toArray();
    }
}
