class Solution {
    public int trap(int[] height) {
        int[] temp = new int[height.length];
        int trapped = 0;
        temp[height.length - 1] = 0;
        for(int i = height.length - 2; i >= 0; i--) {
            temp[i] = Math.max(height[i+1], temp[i+1]);
        }
        int leftMax = 0;
        for(int i = 0; i < height.length; i++) {
            int trapped_i = Math.min(leftMax, temp[i]) - height[i];
            if(trapped_i > 0) {trapped += trapped_i;}
            leftMax = Math.max(leftMax, height[i]);
        }
        return trapped;
    }
}
