class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int length = str.length();
            sb.append(length).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int d = str.indexOf('#', index);
            int length =
                Integer.parseInt(str.substring(index, d));

            int start = d + 1;
            int end = start + length;
            result.add(str.substring(start, end));
            index = end;
        }
        return result;
    }
}
