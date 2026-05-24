class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for(String s : strs){
            encoded.append(s.length()).append("#").append(s);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> results = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            //Find seperator #
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            //Get the length
            int length = Integer.parseInt(str.substring(i,j));
            //get the string
            j++;
            String word = str.substring(j,j + length);
            results.add(word);

            i = j + length;
        }

        return results;
    }
}
