class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i=0; i<s.length(); i++) {
            char s_element = s.charAt(i);
            char t_element = t.charAt(i);
            count[s_element - 'a']++;
            count[t_element - 'a']--;
        }
        for (int v : count) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
