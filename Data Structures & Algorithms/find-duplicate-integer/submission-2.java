class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        slow = nums[slow];
        fast = nums[nums[fast]];
        while(fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int slow2 = nums[0];
        while(true) {
            if(slow == slow2) {
                return slow;
            }
            slow = nums[slow];
            slow2 = nums[slow2];
        }
    }
}
