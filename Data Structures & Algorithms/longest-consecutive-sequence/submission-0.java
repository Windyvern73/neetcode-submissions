class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        int max = 0;
        for(int n : nums) {
            elements.add(n);
        }
        for(int n : nums) {
            int length = 1;
            if(!elements.contains(n-1)) {
                while(elements.contains(++n)) {
                    length++;
                }
                max = length > max ? length : max;
            }
        }
        return max;
    }
}
