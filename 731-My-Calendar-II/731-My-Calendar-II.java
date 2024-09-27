class MyCalendarTwo {

    private ArrayList<int[]> calendar;

    public MyCalendarTwo() {
        
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        ArrayList<int[]> booked = new ArrayList<>();
		
        for (int[] event : calendar) {
            int bs = event[0];
            int be = event[1];
            int booked_cnt = event[2];

            if (start < be && end > bs) {
                if (booked_cnt >= 2) return false;
                
                booked.add(new int[] {Math.max(start, bs), Math.min(end, be), booked_cnt + 1});
            }
        }
		
        calendar.add(new int[] {start, end, 1}); 
		
        for (int[] b : booked) {
            calendar.add(b);  
        }
		
        return true; 
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */