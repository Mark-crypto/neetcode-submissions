class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            char letter2 = t.charAt(i);
            freq[letter - 'a']++;
            freq[letter2 - 'a']--; 
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                return false;
            }
        }

        return true;
    }
}
