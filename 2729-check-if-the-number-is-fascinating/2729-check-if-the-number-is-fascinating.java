class Solution {
    public boolean isFascinating(int n) {
        if(n > 333) return false;
        int[] temp = new int[10];
        
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        
        if(a == 0 || b == 0 || c == 0 || a == b || b == c || a == c) return false;
        
        temp[a] = 1;
        temp[b] = 1;
        temp[c] = 1;
        
        int d = (n * 2) / 100;
        int e = (n * 2) % 100 / 10;
        int f = (n * 2) % 10;
        
        if(d == 0 || e == 0 || f == 0 || temp[d] == 1 || temp[e] == 1 || temp[f] == 1 || d == e || e == f || d == f) return false;
        
        temp[d] = 1;
        temp[e] = 1;
        temp[f] = 1;
        
        int g = (n * 3) / 100;
        int h = (n * 3) % 100 / 10;
        int i = (n * 3) % 10;
        
        if(g == 0 || h == 0 || i == 0 || temp[g] == 1 || temp[h] == 1 || temp[i] == 1 || g == h || h == i || g == i) return false;
        
        return true;
    }
}