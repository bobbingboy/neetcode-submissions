class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int [] s_arr = new int[26];
        int [] t_arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char current_s = s.charAt(i);
            char current_t = t.charAt(i);
            s_arr[current_s - 'a']++;
            t_arr[current_t - 'a']++;
        }

        return Arrays.toString(s_arr).equals(Arrays.toString(t_arr));
    }
}
