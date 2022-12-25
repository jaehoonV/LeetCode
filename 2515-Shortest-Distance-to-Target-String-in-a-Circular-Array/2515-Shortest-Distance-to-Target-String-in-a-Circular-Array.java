class Solution {
    public int closetTarget(String[] words, String target, int s) {
        int n = words.length;
        int i = 0;
        int temp = 3000;
        while(i < n){
            if(words[i].equals(target)) {
                if(s >= i){
                    temp = Math.min(temp, Math.min(Math.abs(s - i), Math.abs(n - s + i)));
                } else{
                    temp = Math.min(temp, Math.min(Math.abs(i - s), Math.abs(n - i + s)));
                }
               
            }
            i++;
        }
        if(temp == 3000) return -1;
        
        return temp; 
    }
}