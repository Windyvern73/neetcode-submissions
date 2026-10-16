class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int n : nums) {
            map.add(n);
        }
        return (map.size() == nums.length) ? false : true;
    }
}