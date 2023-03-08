class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int output = 0;
        int i = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int n = piles.length;
        
        while (i < max) {
            int mid = (i + max) / 2;
            if (func(piles, mid, h)) {
                max = mid;
            } else {
                i = mid + 1;
            }
        }
        return i;
    }
    public boolean func(int[] piles, int a, int h){
        int cnt = 0;
        for(int p : piles){
            cnt += (p / a) + (p % a != 0 ? 1 : 0);
            if(cnt > h) return false;
        }
        return true;
    }
}