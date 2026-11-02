class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        int l = 0;
        int r = 0;
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        while(r < nums.length) {
            int[] e = {r, nums[r]};
            maxHeap.add(e);
            if(r - l + 1 >= k) {
                if(r - l + 1 > k) {l++;}
                while(maxHeap.peek()[0] < l || maxHeap.peek()[0] > r) {
                    maxHeap.poll();
                }
                result[resultIndex++] = maxHeap.peek()[1];
            }
            r++;
        }
        return result;
    }
}
