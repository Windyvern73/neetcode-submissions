class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;
        for(int i = 0; i <= n; i++) {
            while(!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int lastIndex = stack.pop();
                if(stack.isEmpty()) {
                    maxArea = Math.max(maxArea, i * heights[lastIndex]);
                }
                else {
                    maxArea = Math.max(maxArea, (i - stack.peek() - 1) * heights[lastIndex]);
                }
            }
            stack.push(i);
        }
        return maxArea;
    }
}
