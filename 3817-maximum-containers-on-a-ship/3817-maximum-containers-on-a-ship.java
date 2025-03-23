class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int output = 0;
        int a = 0;
        
        while(true){
            a += w;
            if(a <= maxWeight && output < n * n){
                output++;
            }else{
                break;
            }
            
        }
        
        return output;
    }
}