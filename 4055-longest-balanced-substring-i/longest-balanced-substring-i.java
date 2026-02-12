class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] counts = new int[26];
            int distinctCount = 0;
            int currentMaxFreq = 0;

            for (int j = i; j < n; j++) {
                int char_idx = s.charAt(j) - 'a';
                
            
                if (counts[char_idx] == 0) {
                    distinctCount++;
                }
                
                counts[char_idx]++;
                currentMaxFreq = Math.max(currentMaxFreq, counts[char_idx]);

                int currentLen = j - i + 1;
                
                if (distinctCount * currentMaxFreq == currentLen) {
                    maxLen = Math.max(maxLen, currentLen);
                }
            }
        }
        return maxLen;
    }
}
    
