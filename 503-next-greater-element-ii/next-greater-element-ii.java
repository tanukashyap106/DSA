class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> s =new Stack<>();
        int [] ans=new int[n];
        s.push(nums[n-1]);
        for(int i=0;i<n;i++){
            ans[i]= -1;
        }
        for(int i=(2*n)-2;i>=0;i--){
            while(!s.isEmpty()){
            int top=s.peek();
            if(nums[i%n]<top){
                ans[i%n]=top;
                break;
            }
            else{
                s.pop();
            }}

        
        s.push(nums[i%n]);
        }
        return ans;
        
    }
}