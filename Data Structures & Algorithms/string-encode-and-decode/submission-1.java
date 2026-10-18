class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s: strs) {
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            strs.add(str.substring(hashIndex + 1, hashIndex + 1 + len));
            i = hashIndex + 1 + len;
        }
        return strs;
    }
}
