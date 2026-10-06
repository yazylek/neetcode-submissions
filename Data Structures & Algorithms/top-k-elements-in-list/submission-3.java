class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> occur = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!occur.containsKey(num)) {
                occur.put(num, 1);
            } else {
                occur.put(num, occur.get(num) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(occur.entrySet());
        entries.sort( (a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];

        for (int i = 0; i < k; i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
