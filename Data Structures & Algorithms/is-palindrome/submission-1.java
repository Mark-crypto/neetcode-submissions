class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(right > left){
            while(right > left && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(right > left && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

             if(right > left && s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
