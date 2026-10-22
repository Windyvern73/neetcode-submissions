class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;;
        int right = s.length() - 1;
        while(left < right){
            int leftChar = s.charAt(left);
            int rightChar = s.charAt(right);
            while( (left < s.length() - 1) && (leftChar < 48 || leftChar > 57) && (leftChar < 65 || leftChar > 90) && (leftChar < 97 || leftChar > 122)) {
                leftChar = s.charAt(++left);
            }
            while( (right > 0) && (rightChar < 48 || rightChar > 57) && (rightChar < 65 || rightChar > 90) && (rightChar < 97 || rightChar > 122)) {
                rightChar = s.charAt(--right);
            }
            if(left >= right) {
                break;
            }

            if(leftChar >= 65 && leftChar <= 90) {
                leftChar = Character.toLowerCase((char)leftChar);
            }
            if(rightChar >= 65 && rightChar <= 90) {
                rightChar = Character.toLowerCase((char)rightChar);
            }

            if(leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
