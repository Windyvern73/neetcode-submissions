class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> numChar_s = new HashMap<>();
        HashMap<Character, Integer> numChar_t = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(numChar_s.containsKey(s.charAt(i))) {
                numChar_s.put(s.charAt(i), numChar_s.get(s.charAt(i)) + 1);
            }
            else {
                numChar_s.put(s.charAt(i), 1);
            }
            if(numChar_t.containsKey(t.charAt(i))) {
                numChar_t.put(t.charAt(i), numChar_t.get(t.charAt(i)) + 1);
            }
            else {
                numChar_t.put(t.charAt(i), 1);
            }
        }
        if(numChar_s.size() != numChar_t.size()) {
            return false;
        }
        for(Character n : numChar_s.keySet()) {
            if(!numChar_s.get(n).equals(numChar_t.get(n))) {
                return false;
            }
        }
        return true;
    }
}
