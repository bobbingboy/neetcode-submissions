class Solution {


    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            int length = str.length();
            sb.append(length)
            .append("#")
            .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            // get the next # character
            int delimiterIndex = str.indexOf("#", i);
            // get the length and string itself by separate by #
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            int start = delimiterIndex + 1;
            int end = start + length;
            result.add(str.substring(start, end));
            i = end;
        }
        return result;

    }
}
