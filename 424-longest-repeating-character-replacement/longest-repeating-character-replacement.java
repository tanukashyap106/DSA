class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;
        
        int[] map = new int[26];
        int i = 0, maxWindow = 0;
        for (int j = 0; j < s.length(); j++) {
            map[s.charAt(j) - 'A']++;
            while (!isWindowValid(map, k)) {
                map[s.charAt(i) - 'A']--;
                i++;
            }
            maxWindow = Math.max(maxWindow, j - i + 1);
        }
        return maxWindow;
    }

    private boolean isWindowValid(int[] map, int k) {
        int totalCount = 0, maxCount = 0;
        for (int count : map) {
            totalCount += count;
            maxCount = Math.max(maxCount, count);
        }
        return (totalCount - maxCount <= k);
    

    }
}