class Solution {
    public String removeOuterParentheses(String s) {
        int level = -1;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                ++level;
                if(level != 0) ans.append(s.charAt(i));
            } else {
                if(level != 0) ans.append(s.charAt(i));
                --level;
            }
        }
        return ans.toString();
        
    }
}