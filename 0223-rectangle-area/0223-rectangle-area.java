class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int output = Math.abs((ax1 - ax2) * (ay1 - ay2)) + Math.abs((bx1 - bx2) * (by1 - by2));
        
        int x = Math.min(ax2, bx2) - Math.max(ax1, bx1);
        int y = Math.min(ay2, by2) - Math.max(ay1, by1);
        
        int total = x * y;
        
        if(x < 0 || y < 0){
            total = 0;
        }
        
        return output - total;
    }
}