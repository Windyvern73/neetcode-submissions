class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] ans = new int[k];
        for(int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        List<List<Integer>> buckets = new ArrayList<>(nums.length);
        for(int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for(int key : freq.keySet()) {
            int index = freq.get(key) - 1;
            buckets.get(index).add(key);
        }
        int bucket_num = nums.length;
        for(int i = 0; i < k; i++) {
            while(buckets.get(bucket_num).isEmpty()) {
                bucket_num--;
            }
            ans[i] = buckets.get(bucket_num).removeLast();
            if(buckets.get(bucket_num).isEmpty()) {
                bucket_num--;
            }
        }
        return ans;
    }
}
