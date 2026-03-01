class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
        freq.put(c,freq.getOrDefault(c,0)+1);
    }
    Set<Character> v=Set.of('a','e','i','o','u');
    int maxV=0,maxC=0;
    for(var entry:freq.entrySet()){
        char ch=entry.getKey();
        int c=entry.getValue();
        if(v.contains(ch)){
            maxV=Math.max(maxV,c);
        }
        else{
            maxC=Math.max(maxC,c);
        }
    }
    return maxV+maxC;
    }
}