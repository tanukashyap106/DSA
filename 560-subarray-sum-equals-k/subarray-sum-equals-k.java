class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> ans=new HashMap<>();
        int presum=0;
        int count=0;
        ans.put(0,1);
        for(int i=0;i<n;i++){
            presum+=nums[i];
            int com=presum-k;
            if(ans.containsKey(com)){
                count+=ans.get(com);
            }
            ans.put(presum,ans.getOrDefault(presum,0)+1);
        }
        return count;
    }
}