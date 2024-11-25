class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int output = Integer.MAX_VALUE, n = nums.size(), temp = 0;
        Deque<Integer> window = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++){
            temp = 0;
            
            for(int j = i; j < n; j++){
                temp += nums.get(j);
                int size = j - i + 1;
                if(size >= l && size <= r && temp > 0){
                    output = Math.min(output, temp);
                }
            }
            
        }
        
        return output == Integer.MAX_VALUE ? -1 : output;
    }
}