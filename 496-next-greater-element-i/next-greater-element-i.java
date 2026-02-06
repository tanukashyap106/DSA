class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        int n=n2.length;
        s.push(n2[n-1]);
        map.put(n2[n-1],-1);
        for(int i=n-2;i>=0;i--){
            if(n2[i]<s.peek()){
                map.put(n2[i],s.peek());
            }
            while(!s.isEmpty()){
                if(s.peek()<n2[i]){
                    s.pop();

                }else{
                    map.put(n2[i],s.peek());
                    break;
                }
            }
            if(s.isEmpty()){
                map.put(n2[i],-1);
            }
        
        s.push(n2[i]);
        }
        int [] ans=new int[n1.length];
        for(int i=0;i<n1.length;i++){
           ans[i]= map.get(n1[i]);
        }
        return ans;
    }
}