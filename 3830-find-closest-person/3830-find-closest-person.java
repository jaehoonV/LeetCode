class Solution {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(x - z);
        int yz = Math.abs(y - z);
        
        if(xz == yz) return 0;
        
        return xz > yz ? 2 : 1;
    }
}