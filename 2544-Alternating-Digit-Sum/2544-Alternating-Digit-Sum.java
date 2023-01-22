class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int output = 0;
        while(n > 0) {
            arr.add(n % 10);
            n /= 10;
        }
        int a = -1;
        int l = arr.size();
        
        if(l % 2 != 0){
            a = 1;
        }
        for(int i = 0; i < l; i++){
            output += arr.get(i) * a;
            a *= -1;
        }
        return output;
    }
}