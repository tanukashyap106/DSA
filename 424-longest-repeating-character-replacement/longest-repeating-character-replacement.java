class Solution {
    public int characterReplacement(String s, int k) {
        if(s==null || s.length()==0) return 0;
        int[] map=new int[26];
        int i=0,maxw=0;
        for(int j=0;j<s.length();j++){
            map[s.charAt(j)-'A']++;
            while(!isValid(map,k)){
                map[s.charAt(i)-'A']--;
                i++;
            }
            maxw=Math.max(maxw,j-i+1);

        }
        return maxw;
    }
        private boolean isValid(int[] map,int k){
            int totalCount=0;
            int maxCount=0;
            for(int count : map){
                totalCount+=count;
                maxCount=Math.max(maxCount,count);

            }     

            return (totalCount-maxCount<=k);
        
        }
    
}