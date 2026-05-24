class Solution {
    public boolean isPalindrome(String s) {
       s = s.toLowerCase();
       StringBuilder clean = new StringBuilder();
       for(char c : s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
               clean.append(c);
           }
       }
       String str = clean.toString();
       String newStr = new StringBuilder(str).reverse().toString();
       return str.equals(newStr);
    }
}
