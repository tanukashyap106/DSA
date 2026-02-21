class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1])
            twoSum(nums,i,ans);
        }
        return ans;
    }
        public void twoSum(int[] arr,int x,List<List<Integer>> ans){
            int i=x+1;
            int j=arr.length-1;
            while(i<j){
                int sum = arr[i]+arr[j]+arr[x];
                if(sum<0){
                    i++;
                }
                else if(sum>0){
                    j--;
                }
                else{
                    ans.add(Arrays.asList(arr[i],arr[j],arr[x]));
                    i++;
                    j--;
                    while(i<j && arr[i]==arr[i-1]) i++;
                }
            }
        }
    
}