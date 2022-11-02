class KthLargest {
    PriorityQueue<Integer> Q=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i=0;i<nums.length;i++)
        {
            Q.add(nums[i]);
        }
    }
    
    public int add(int val) {
        Q.add(val);
        while(Q.size()>k)
        {
            Q.poll();
        }
        return Q.peek();
    }
}
