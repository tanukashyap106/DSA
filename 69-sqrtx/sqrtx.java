class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=2;
        int r=x/2;
        while(l<=r){
            int m=(l+r)/2;
            long s=(long)m*m;
            if(x==s){
                return m;
            }
            else if(x<s){
                r=m-1;
            }else{
                l=m+1;
            }

        }
        return r;
        
    }
}