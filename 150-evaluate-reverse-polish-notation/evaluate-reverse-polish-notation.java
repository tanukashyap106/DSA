class Solution {
    public int evalRPN(String[] arr) {

        Stack<Integer> stack=new Stack<>();
        Map<String,BiFunction<Integer,Integer,Integer>> map=new HashMap<>();
        map.put("+",(a,b)->b+a);
        map.put("-",(a,b)->b-a);
        map.put("*",(a,b)->b*a);
        map.put("/",(a,b)->b/a);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int a=stack.pop();
                int b=stack.pop();
                int ans=map.get(arr[i]).apply(a,b);
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(arr[i]));
            }
        }
        return stack.pop();
        
    }
}