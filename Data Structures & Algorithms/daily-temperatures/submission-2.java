class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> decreasing = new Stack<>();
        int[] result = new int[temperatures.length];
        decreasing.push(0);
        for(int i = 1; i < temperatures.length; i++) {
            while(!decreasing.isEmpty() && temperatures[decreasing.peek()] < temperatures[i]) {
                int currInd = decreasing.pop();
                result[currInd] = i - currInd;
            }
            decreasing.push(i);
        }
        return result;
    }
}
