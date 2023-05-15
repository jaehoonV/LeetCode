class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
        for(String s:details){
            if((int)(((s.charAt(11) - '0') * 10) + s.charAt(12) - '0') > 60) cnt++;
        }
        return cnt;
    }
}