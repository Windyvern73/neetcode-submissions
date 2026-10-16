class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String s : strs) {
            int[] chars = new int[26];
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                chars[c - 'a'] += 1;
            }
            List<String> group = anagrams.get(Arrays.toString(chars));
            if(group != null) {
                group.add(s);
            }
            else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                ans.add(newGroup);
                anagrams.put(Arrays.toString(chars), newGroup);
            }
        }
        return ans;
    }
}