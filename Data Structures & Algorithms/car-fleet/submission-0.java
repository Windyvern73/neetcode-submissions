class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        int fleets = 0;
        for(int i = 0; i < cars.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a,b) -> b[0] - a[0]);
        for(int i = 0; i < cars.length; i++) {
            float time = (target - cars[i][0]) / (float) cars[i][1];
            fleets++;
            i++;
            while(i < cars.length && ((target - cars[i][0]) / (float) cars[i][1] <= time)) {
                i++;
            }
            i--;
        }
        return fleets;
    }
}
