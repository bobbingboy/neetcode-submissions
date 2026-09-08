class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int [] charCount_s = new int[26];
        int [] charCount_t = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char current_s_char = s.charAt(i);
            char current_t_char = t.charAt(i);
            charCount_s[current_s_char - 'a']++;
            charCount_t[current_t_char - 'a']++;
        }
        return Arrays.toString(charCount_s).equals(Arrays.toString(charCount_t));

    }
}
