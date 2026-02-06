class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int [] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        s.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty()){
                int top=s.peek();
            if(t[i]>=t[top]){
                s.pop();
            }
            else{
              ans[i]=top-i;
              break;
            }}
        s.push(i);
            }
        return ans;
    }
}