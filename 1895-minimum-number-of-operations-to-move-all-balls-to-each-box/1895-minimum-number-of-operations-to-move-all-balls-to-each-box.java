class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] output = new int[n];
        
        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = 0; j < i; j++){
                if(boxes.charAt(j) == '1'){
                    temp += (i - j);
                }
            }

            for(int k = i + 1; k < n; k++){
                if(boxes.charAt(k) == '1'){
                    temp += (k - i);
                }
            }
            output[i] = temp;
        }
        return output;
    }
}