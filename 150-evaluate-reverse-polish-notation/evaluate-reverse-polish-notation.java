//import.java.util.*;
//import.java.function.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        Map<String,BiFunction<Integer,Integer,Integer>> map=new HashMap<>();
        map.put("+" ,(a,b)->b+a);
        map.put("-",(a,b)->b-a);
        map.put("*",(a,b)->b*a);
        map.put("/",(a,b)->b/a);
        for(int i=0;i<tokens.length;i++){
            if(map.containsKey(tokens[i])){
                int a=s.pop();
                int b=s.pop();
                int ans=map.get(tokens[i]).apply(a,b);
                s.push(ans);
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
    return s.pop();
        
    }
}