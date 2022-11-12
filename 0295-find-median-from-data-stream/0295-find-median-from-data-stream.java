class MedianFinder {
    
    ArrayList<Integer> arr;

    public MedianFinder() {
        arr = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        if(arr.size() > 0){
            int i;
            for (i = 0; (i < arr.size()  && arr.get(i) < num); i++);
            if(i == -1) i = 0;
            
            arr.add(i , num);
        } else{
            arr.add(num);
        }
    }
    
    public double findMedian() {

        int i = arr.size() / 2;
        
        if(arr.size() % 2 == 0){
            return (double)(arr.get(i) + arr.get(i - 1)) / 2;
        }
        
        return arr.get(i);
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */