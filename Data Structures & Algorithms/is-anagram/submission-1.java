class Solution {
    public boolean isAnagram(String s, String t) {
        int[]freq = new int[26];
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            int pos = s.charAt(i) - 'a';
            int pos2 = t.charAt(i) - 'a';
            freq[pos]++;
            freq[pos2]--;
        }

        for(int j = 0; j < freq.length; j++){
            if(freq[j] != 0){
                return false;
            }
        }
        return true;
    }
}
