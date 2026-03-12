class Solution {
    public String largestOddNumber(String s) {
        int n=s.length()-1;
        while(n>=0){
            if((s.charAt(n)-'0')%2==1){
                return s.substring(0,n+1);
            }
            n--;
        }
        return "";
        
    }
}