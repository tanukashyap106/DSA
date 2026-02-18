class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum>target){
                end--;
            }
            else if(sum<target){
                start++;
            }
            else{
                return new int [] {start+1,end+1};
            }

            }   
        return new int[] {};
    }
}