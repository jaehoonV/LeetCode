class Solution {
    public int countCollisions(String directions) {
        int n = directions.length(), output = 0, a = 0, b = n - 1; 

        while(a < n && directions.charAt(a) == 'L'){
            a++;
        }
        while(b >= a && directions.charAt(b) == 'R'){
            b--;
        }

        for(int i = a; i <= b; i++) {
            if(directions.charAt(i) != 'S') output++;
        }
        return output;
    }
}