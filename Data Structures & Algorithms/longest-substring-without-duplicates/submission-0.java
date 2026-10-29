class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int longest = 0;
        int currentLength = 0;
        HashSet<Character> seen = new HashSet<>();
        while(r < s.length()) {
            char c = s.charAt(r);
            while(seen.contains(c)) {
                seen.remove(s.charAt(l++));
                currentLength--;
            }
            currentLength++;
            seen.add(c);
            longest = Math.max(longest, currentLength);
            r++;
        }
        return longest;
    }
}
