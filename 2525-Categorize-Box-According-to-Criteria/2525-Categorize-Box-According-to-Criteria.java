class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        boolean b = false;

        if(Math.max(l,Math.max(w,h)) >= 10_000) b = true;
        if((long)l * (long)w * (long)h >= 1000_000_000) b = true;

        if(b && m >= 100)     return "Both";
        else if(!b && m < 100)      return "Neither";
        else if(!b && m >= 100)     return "Heavy";
        else return "Bulky";
    }
}