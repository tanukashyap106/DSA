class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ws=0;
        int i=0;
            for(int j=0;j<s.length();j++){
                if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=i){
                    i=map.get(s.charAt(j))+1;
                }
                map.put(s.charAt(j),j);
               int curr=j-i+1;
                ws=Math.max(ws,curr);

            }
            return ws;
        
        
    }
}