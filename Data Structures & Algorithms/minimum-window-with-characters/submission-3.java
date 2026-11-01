class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> charFreq_s = new HashMap<>();
        HashMap<Character, Integer> charFreq_t= new HashMap<>();
        int res_length = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int res_l = 0;
        int res_r = 0;
        int have = 0;
        for(int i = 0; i < t.length(); i++) {
            charFreq_t.put(t.charAt(i), charFreq_t.getOrDefault(t.charAt(i), 0) + 1);
        }
        int need = charFreq_t.size();
        while (r < s.length()) {
            charFreq_s.put(s.charAt(r), charFreq_s.getOrDefault(s.charAt(r), 0) + 1);
            if(charFreq_t.getOrDefault(s.charAt(r), 0).equals(charFreq_s.get(s.charAt(r)))) {
                have++;
            }
            while(have == need) {
                if(r - l + 1 < res_length) {
                    res_length = r - l + 1;
                    res_l = l;
                    res_r = r;
                }
                charFreq_s.put(s.charAt(l), charFreq_s.get(s.charAt(l)) - 1);
                if(charFreq_s.get(s.charAt(l)) < charFreq_t.getOrDefault(s.charAt(l), 0)) {
                    have--;
                }
                l++;
            }
            r++;
        }
        if(res_length == Integer.MAX_VALUE) {
            return "";
        }
        else {
            return s.substring(res_l, res_r + 1);
        }
    }
}
