class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counter1 = new HashMap<>();
        HashMap<Character, Integer> counter2 = new HashMap<>();
        for(char l : s.toCharArray()){
            if (counter1.containsKey(l)){
                int val = counter1.get(l);
                val++;
                counter1.put(l, val);
            } else {
                counter1.put(l, 1);
            }
        }

        for(char l : t.toCharArray()){
            if (counter2.containsKey(l)){
                int val = counter2.get(l);
                val++;
                counter2.put(l, val);
            } else {
                counter2.put(l, 1);
            }
        }

        if (counter1.equals(counter2)){
            return true;
        }else{
            return false;
        }
    }
}
