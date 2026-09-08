class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> countMap_s = new HashMap<>();
        Map<Character, Integer> countMap_t = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            if (!countMap_s.containsKey(s.charAt(i))) {
                countMap_s.put(s.charAt(i), 1);
            } else {
                countMap_s.put(s.charAt(i), countMap_s.get(s.charAt(i)) +1);
            }
            if (!countMap_t.containsKey(t.charAt(i))) {
                countMap_t.put(t.charAt(i), 1);
            } else {
                countMap_t.put(t.charAt(i), countMap_t.get(t.charAt(i)) +1);
            }
        }
        return countMap_s.equals(countMap_t);
    }
}
