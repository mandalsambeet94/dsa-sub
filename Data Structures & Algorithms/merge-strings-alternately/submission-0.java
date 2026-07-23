class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder s = new StringBuilder();

        while(i< word1.length() && j< word2.length()) {
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            i++;
            j++;
        }
        s.append(word1.substring(i, word1.length()));
        s.append(word2.substring(i, word2.length()));
        return s.toString();
    }
}