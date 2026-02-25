class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> q = new LinkedList<>();
        int i = 0, j = 0;
        while (j < arr.length) {
            while (!q.isEmpty() && arr[j] > q.peekLast()) {
                q.pollLast();
            }
            q.offerLast(arr[j]);

            if (j >= k - 1) {
                res.add(q.peekFirst());
                if (arr[i] == q.peekFirst()) q.pollFirst();
                i++;
            }
            j++;
        }
        int[] ans = new int[res.size()];
        for (int x = 0; x < res.size(); x++) {
            ans[x] = res.get(x);
        }
        return ans;
    }
}