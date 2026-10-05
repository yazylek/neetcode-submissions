class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(str);
            } else {
                ArrayList<String> words = new ArrayList<>();
                words.add(str);
                hashMap.put(key, words);
            }

        }

                return new ArrayList<>(hashMap.values());

    }
}
