class Solution {
    // hello world -> 5#hello5#world
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();
        while (i < str.length()){
            int index = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, index));
            int start = index + 1;
            int end = start + length;

            String word = str.substring(start, end);

            result.add(word);

            i = end;
            
        }

        return result;
    }
}
