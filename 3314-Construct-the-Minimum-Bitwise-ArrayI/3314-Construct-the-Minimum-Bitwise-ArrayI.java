class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] output = new int[n];
        
        for(int i = 0; i < n; i++){
            int temp = nums.get(i);
            for(int j = 0; j <= temp; j++){
                if((j | (j + 1)) == temp){
                    output[i] = j;
                    break;
                }
            }
            if(output[i] == 0) output[i] = -1;
        }
        
        return output;
    }
}