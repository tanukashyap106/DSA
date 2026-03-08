class Solution {
    public boolean isPalindrome(String s) {
           StringBuilder filtered = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char lower = Character.toLowerCase(c);
                filtered.append(lower);
                rev.insert(0, lower);
            }
        }
        return filtered.toString().equals(rev.toString());
        
    }
}