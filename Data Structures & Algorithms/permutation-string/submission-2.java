class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] arr0 = new int[26];
        int[] arr1 = new int[26];
        
        // Initialize arr0 with s1 counts
        for (int i = 0; i < s1.length(); i++) {
            arr0[s1.charAt(i) - 'a']++;
            arr1[s2.charAt(i) - 'a']++;
        }
        
        // Initialize arr1 with first window of s2
        // for (int i = 0; i < s1.length(); i++) {
        //     arr1[s2.charAt(i) - 'a']++;
        // }
        
        // Check first window
        if (Arrays.equals(arr0, arr1)) {
            return true;
        }
        
        // Slide the window
        int left = 0;
        int right = s1.length();
        
        while (right < s2.length()) {
            // Remove left character
            arr1[s2.charAt(left) - 'a']--;
            
            // Add right character
            arr1[s2.charAt(right) - 'a']++;
            
            // Check new window
            if (Arrays.equals(arr0, arr1)) {
                return true;
            }
            
            left++;
            right++;
        }
        
        return false;
    }
}
