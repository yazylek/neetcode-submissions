class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers =
            Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int result = 0;

        for (int num : numbers) {
                int curr = num;
                int currLength = 1;
            if (!numbers.contains(curr - 1)) {
                while (numbers.contains(curr + 1)) {
                    curr++;
                    currLength++;
                }
                result = Math.max(currLength, result);
            }
        }

        return result;
    }
}
