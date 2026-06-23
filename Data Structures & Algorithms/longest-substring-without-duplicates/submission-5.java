class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }

        StringBuilder str = new StringBuilder(String.valueOf(s.charAt(0)));
        int max_count=1, curr_count=1;
        
        for (int i =1; i< s.length(); i++) {
            int index = str.indexOf(String.valueOf(s.charAt(i)));

            if (index != -1) {
                max_count = Math.max(max_count, curr_count);
                str.delete(0, i - (i-index-1));
                str.append(s.charAt(i));
                curr_count = str.length();
            }
            else {
                curr_count++;
                str.append(s.charAt(i));
            }
        }
        return Math.max(max_count, curr_count);
    }
}
