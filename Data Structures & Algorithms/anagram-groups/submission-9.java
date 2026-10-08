class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();

        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            if(hashMap.containsKey(key)){
                hashMap.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                hashMap.put(key, list);
            }
        }

        return new ArrayList<>(hashMap.values());
    }
}
