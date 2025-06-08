class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> output = new  ArrayList<>();
        int t = 1; 
        for(int i = 1; i <= n; i++){
            output.add(t);
            
            if(t * 10 <= n) t *= 10;
            else{
                while(t % 10 == 9 || t >= n){
                    t /= 10;   
                } 
                t += 1;
            }
        }
        
        return output;
    }
}