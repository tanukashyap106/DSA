class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=2;
        int r=x/2;
        while(l<=r){
            int m=l+(r-l)/2;
            long sq=(long)m*m;
            if(sq==x) return m;
            else if(sq>x){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return r;
    }
}