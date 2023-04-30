class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int s1 = 0, s2 = 0;
        
        for(int i = 0; i < p1.length; i++){
            if((i >= 1 && p1[i - 1] == 10) || (i >= 2 && p1[i - 2] == 10)){
                s1 += (p1[i] * 2);
            }else{
                s1 += p1[i];
            }
            
            if((i >= 1 && p2[i - 1] == 10) || (i >= 2 && p2[i - 2] == 10)){
                s2 += (p2[i] * 2);
            }else{
                s2 += p2[i];
            }
        }
        if(s1 > s2) return 1;
        else if(s1 < s2) return 2;
        else return 0;
    }
}