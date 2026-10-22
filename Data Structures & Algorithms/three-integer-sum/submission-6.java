class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);
        while(i < nums.length - 2 && nums[i] <= 0) {
            if(i > 0 && nums[i] == nums[i-1]) {
                i++;
                continue;
            }
            int l = i+1;
            int r = nums.length - 1;
            int target = -1 * nums[i];
            while(l < r) {
                int sum = nums[l] + nums[r];
                if(sum < target) {
                    l++;
                }
                else if(sum > target) {
                    r--;
                }
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]); triplet.add(nums[l]); triplet.add(nums[r]);
                    ans.add(triplet);
                    l++; r--;
                    while (l < r && nums[l] == nums[l-1]) {l++;}
                    while (l < r && nums[r] == nums[r+1]) {r--;}
                }
            }
            i++;
        }
        return ans;
    }
}
