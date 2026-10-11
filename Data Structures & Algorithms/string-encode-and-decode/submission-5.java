class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int index = str.indexOf("#", i);
            String substr = str.substring(i, index);
            int length = Integer.parseInt(substr);
            int start = index + 1;
            int end = start + length;
            String word = str.substring(start, end);

            result.add(word);

            i = end;
        }

        return result;
    }
}
