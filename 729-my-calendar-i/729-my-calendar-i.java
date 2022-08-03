class MyCalendar {
    
    TreeMap<Integer, Integer> tm;

    public MyCalendar() {
        tm = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        if(tm.size() == 0) {
            tm.put(start, end);
            return true;
        }
        if(tm.containsKey(start)) return false;
        
        Integer fkey = tm.floorKey(start);
        if(fkey != null && tm.get(fkey) > start) return false;
        
        Integer ckey = tm.ceilingKey(start);
        if(ckey != null && ckey < end) return false;
        
        tm.put(start, end);
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */