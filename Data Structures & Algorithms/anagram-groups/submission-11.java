class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] countArray = new int[26];
            for (int i=0; i<str.length(); i++) {
                countArray[str.charAt(i) -'a']++;
            }
            String countString = Arrays.toString(countArray);
            if (!map.containsKey(countString)) {
                map.put(countString, new ArrayList<>());
            }
            map.get(countString).add(str);
        }
        List<List<String>> results = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            results.add(entry.getValue());
        }
        return results;
    }
}
