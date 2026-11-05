class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int n : piles) {
            max = Math.max(max, n);
        }
        int l = 1;
        int r = max;
        int min_k = max;
        while(l <= r) {
            int mid = l + (r-l)/2;
            long total_time = 0;
            for(int n : piles) {
                total_time += (int) Math.ceil((double) n / mid);
            }
            if(total_time <= h) {
                r = mid - 1;
                min_k = Math.min(min_k, mid);
            }
            else {
                l = mid + 1;
            }
        }
        return min_k;
    }
}
