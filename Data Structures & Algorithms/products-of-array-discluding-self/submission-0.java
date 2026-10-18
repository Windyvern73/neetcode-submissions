class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preproduct = 1, postproduct = 1;
        int[] prefix = new int[nums.length], suffix = new int[nums.length], output = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int j = nums.length - 1 - i;
            preproduct *= nums[i];
            postproduct *= nums[j];
            prefix[i] = preproduct;
            suffix[j] = postproduct;
        }
        for(int i = 0; i < nums.length; i++) {
            output[i] = 1;
            if(i + 1 < nums.length) {
                output[i] *= suffix[i+1];
            }
            if(i-1 >= 0) {
                output[i] *= prefix[i-1];
            }
        }
        return output;
    }
}  
