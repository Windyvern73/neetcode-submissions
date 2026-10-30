class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> charFreq1 = new HashMap<>();
        HashMap<Character, Integer> charFreq2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            charFreq1.put(s1.charAt(i), charFreq1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int l = 0;
        int r = 0;
        while(r < s2.length()) {
            charFreq2.put(s2.charAt(r), charFreq2.getOrDefault(s2.charAt(r), 0) + 1);
            while(r - l + 1 > s1.length()) {
                charFreq2.put(s2.charAt(l), charFreq2.get(s2.charAt(l)) - 1);
                if(charFreq2.get(s2.charAt(l)) == 0) {charFreq2.remove(s2.charAt(l));}
                l++;
            }
            if(charFreq2.equals(charFreq1)) {
                return true;
            }
            r++;
        }
        return false;
    }
}
