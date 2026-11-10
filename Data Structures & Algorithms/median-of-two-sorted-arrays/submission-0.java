class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] A = m <= n ? nums1 : nums2;
        int[] B = m > n ? nums1 : nums2;
        int h = (m + n + 1) / 2;
        int l = 0;
        int r = A.length;
        while(l <= r) {
            int i = l + (r - l) / 2;
            int j = h - i;
            int Aleft = i - 1 >= 0 ? A[i-1] : Integer.MIN_VALUE;
            int Aright = i < A.length ? A[i] : Integer.MAX_VALUE;
            int Bleft = j - 1 >= 0 ? B[j-1] : Integer.MIN_VALUE;
            int Bright = j < B.length ? B[j] : Integer.MAX_VALUE;
            if(Aleft <= Bright && Bleft <= Aright) {
                if((m + n) % 2 == 1) {
                    return (double) Math.max(Aleft, Bleft);
                }
                else {
                    return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                }
            }
            if(Aleft > Bright) {
                r = i - 1;
            }
            else {
                l = i + 1;
            }
        }
        return -1;
    }
}
