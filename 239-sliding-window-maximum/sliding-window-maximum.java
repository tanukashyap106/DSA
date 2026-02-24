class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        int n = nums.length;
        int[] res = new int[n - k + 1]; 
        int r = 0; 
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int j = 0; j < n; j++) {

            if (!q.isEmpty() && q.peekFirst() < j - k + 1) {
                q.pollFirst();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[j]) {
                q.pollLast();
            }
            q.offerLast(j);
            if (j >= k - 1) {
                res[r++] = nums[q.peekFirst()];
            }
        }
        
        return res;
    }
}
     
     /*
        List res = new ArrayList<>();
        Deque q = new LinkedList<>();
        int i = 0, j = 0;
        while (j < nums.length) {
            while (!q.isEmpty() && nums[j] > q.peekLast()) {
                q.pollLast();
            }
            q.offerLast(nums[j]);

            if (j >= k - 1) {
                res.add(q.peekFirst());
                if (nums[i] == q.peekFirst()) q.pollFirst();
                i++;
            }
            j++;
        }
        return res;
    }
}*/