class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String s : strs) {
            int[] countArray = new int[26];
            for (int i = 0; i<s.length(); i++) {
                countArray[s.charAt(i) - 'a']++;
            }
            String countArrayString = Arrays.toString(countArray);
            if (!anagramsMap.containsKey(countArrayString)) {
                anagramsMap.put(countArrayString, new ArrayList<>());
            }
            anagramsMap.get(countArrayString).add(s);
        }
        List<List<String>> result = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }


}
