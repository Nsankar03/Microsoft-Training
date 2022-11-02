class MedianFinder {
  
    PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> max=new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        max.add(num);
        min.add(max.poll());
        if(min.size()>max.size())
        {
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size()==min.size())
        {
            return (min.peek()+max.peek())/2.0;
        }
        return max.peek();
    }
}
