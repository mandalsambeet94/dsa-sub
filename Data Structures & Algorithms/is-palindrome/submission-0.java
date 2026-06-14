class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase());
        
    }
}
