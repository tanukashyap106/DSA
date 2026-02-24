class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] hashS=new int[26];
        int[] hashP=new int[26];
        int windowlength=s1.length();
        for(int i=0;i<windowlength;i++){
            hashS[s1.charAt(i)-'a']++;
            hashP[s2.charAt(i)-'a']++;
        }
        int i=0;
        int j=windowlength-1;
        while(j<s2.length()){
            if(isHashSame(hashS,hashP)) return true;
            hashP[s2.charAt(i)-'a']--;
            i++;
            j++;
            if(j<s2.length()){
            hashP[s2.charAt(j)-'a']++;
            }
        }
        return false;

    }
    private boolean isHashSame(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    
}