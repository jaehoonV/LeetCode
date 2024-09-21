class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> output = new  ArrayList<>();
        int temp = 1; 
        for(int i = 1; i <= n; i++){
            output.add(temp);
            
            if(temp * 10 <= n) temp *= 10;
            else{
                while(temp % 10 == 9 || temp >= n){
                    temp /= 10;   
                } 
                temp += 1;
            }
        }
        
        return output;
    }
}