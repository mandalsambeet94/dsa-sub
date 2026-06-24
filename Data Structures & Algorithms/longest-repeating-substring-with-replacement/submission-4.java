class Solution {
    public int characterReplacement(String s, int k) {
        int l=0, max_freq = 0, max_count = 0;
        Map<Character, Integer> freq_map = new HashMap<>();

        for (int i = 0; i< s.length(); i++) {
            freq_map.put(s.charAt(i), freq_map.getOrDefault(s.charAt(i), 0)+ 1);
            max_freq = Math.max(max_freq, freq_map.get(s.charAt(i)));

            if ((i-l+1) - max_freq <= k) {
                max_count = Math.max(max_count, i-l+1);
            }
            else{
                freq_map.put(s.charAt(l), freq_map.get(s.charAt(l))-1);
                l++;
            }
        }

        return max_count;
    }
}
