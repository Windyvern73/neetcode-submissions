class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumDifference = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(sumDifference.containsKey(n)) {
                int[] ans = {sumDifference.get(n), i};
                return ans;
            }
            sumDifference.put(target - n, i);
        }
        return new int[2];
    }
}
