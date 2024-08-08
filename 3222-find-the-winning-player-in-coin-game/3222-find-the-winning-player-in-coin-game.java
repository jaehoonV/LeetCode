class Solution {
    public String losingPlayer(int x, int y) {
        int cnt = 0, z = y / 4;
        
        while(x > 0 && z > 0){
            cnt++;
            x--;
            z--;
        }
        
        return cnt % 2 == 0 ? "Bob" : "Alice";
    }
}