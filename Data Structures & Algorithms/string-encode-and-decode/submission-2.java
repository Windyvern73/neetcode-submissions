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
            StringBuilder length = new StringBuilder();
            char c = str.charAt(i);
            while(i < str.length() - 1 && c != '#') {
                length.append(c + "");
                c = str.charAt(++i);
            }
            i++;
            int len = Integer.parseInt(length.toString());
            strs.add(str.substring(i, i + len));
            i = i + len;
        }
        return strs;
    }
}
