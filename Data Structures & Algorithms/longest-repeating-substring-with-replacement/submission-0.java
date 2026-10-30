class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        HashMap<Character, Integer> charFreq = new HashMap<>();
        int maxLength = 0;
        int currLength = 0;
        int maxFreq = 0;
        while(r < s.length()) {
            char c = s.charAt(r);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
            currLength++;
            maxFreq = Math.max(maxFreq, charFreq.get(c));
            while(currLength - maxFreq > k) {
                charFreq.put(s.charAt(l), charFreq.get(s.charAt(l)) - 1);
                l++;
                currLength--;
            }
            maxLength = Math.max(maxLength, currLength);
            r++;
        }
        return maxLength;
    }
}
