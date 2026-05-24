class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        

        for(int i = 0; i < strs.length; i++){
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);

            if(!map.containsKey(key)){
                 map.put(key,new ArrayList<String>());
            }

           map.get(key).add(strs[i]);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
