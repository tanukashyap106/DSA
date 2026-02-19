class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1) return nums;
        int mid=nums.length/2;
        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] rigth=sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,rigth);
        
    }
    private int[] merge(int[]left,int[]rigth){
        int[]res=new int[left.length+rigth.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<rigth.length)
        res[k++]=(left[i]<rigth[j])?left[i++]:rigth[j++];
        while(i<left.length) res[k++]=left[i++];
        while(j<rigth.length) res[k++]=rigth[j++];
        return res;
    }
}