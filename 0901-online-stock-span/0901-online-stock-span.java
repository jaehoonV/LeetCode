class StockSpanner {
    ArrayList<Integer> a;
    
    public StockSpanner() {
        a = new ArrayList<>();
    }
    
    public int next(int price) {
        a.add(price);
        int cnt = 0;
        for(int i = a.size() - 1; i >= 0; i--){
            if(a.get(i) <= price){
                cnt++;
            }else{
                break;
            }
        }
        return cnt == 0 ? 1 : cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */