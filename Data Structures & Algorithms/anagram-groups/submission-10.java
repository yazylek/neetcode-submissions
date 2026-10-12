class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //act
        Map<String, List<String>> hashmap = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if(hashmap.containsKey(key)){
                hashmap.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                hashmap.put(key, list);
            }

        }

        return new ArrayList<>(hashmap.values());
    }
}
