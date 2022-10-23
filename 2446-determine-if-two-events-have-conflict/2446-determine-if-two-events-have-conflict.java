class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int e1sh = Integer.parseInt(event1[0].substring(0,2));
        int e1sm = Integer.parseInt(event1[0].substring(3,5));
        int e1eh = Integer.parseInt(event1[1].substring(0,2));
        int e1em = Integer.parseInt(event1[1].substring(3,5));
        
        int e2sh = Integer.parseInt(event2[0].substring(0,2));
        int e2sm = Integer.parseInt(event2[0].substring(3,5));
        int e2eh = Integer.parseInt(event2[1].substring(0,2));
        int e2em = Integer.parseInt(event2[1].substring(3,5));
        
        if(e1eh < e2sh || (e1eh == e2sh && e1em < e2sm)) return false;
        if(e2eh < e1sh || (e2eh == e1sh && e2em < e1sm)) return false;
        
        return true;
    }
}