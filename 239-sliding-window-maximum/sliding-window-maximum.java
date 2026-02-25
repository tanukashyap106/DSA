class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res=new ArrayList<>();
        Deque<Integer> q=new LinkedList<>();
        int i=0,j=0;
        while(j<nums.length){
            while(!q.isEmpty() && nums[j]>q.peekLast()){
                q.pollLast();
            }
            q.offerLast(nums[j]);
            if(j>=k-1){
                res.add(q.peekFirst());
                if(nums[i]==q.peekFirst())
                q.pollFirst();
                i++;
            }
            j++;
        }
        int[] ans=new int[res.size()];
        for(int x=0;x<ans.length;x++){
            ans[x]=res.get(x);
        }
        return ans;
    }
}