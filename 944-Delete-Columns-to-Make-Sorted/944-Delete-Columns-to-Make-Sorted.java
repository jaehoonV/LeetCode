class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int temp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(temp <= strs[j].charAt(i)){
                    temp = strs[j].charAt(i);
                } else{
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}