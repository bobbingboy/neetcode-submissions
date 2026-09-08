class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char s_element = s.charAt(i);
            if (!s_map.containsKey(s_element)) {
                s_map.put(s_element, 1);
            } else {
                s_map.put(s_element, s_map.get(s_element) +1);
            }
            char t_element = t.charAt(i);
            if (!t_map.containsKey(t_element)) {
                t_map.put(t_element, 1);
            } else {
                t_map.put(t_element, t_map.get(t_element) +1);
            }
        }


        return s_map.equals(t_map);
    }
}
