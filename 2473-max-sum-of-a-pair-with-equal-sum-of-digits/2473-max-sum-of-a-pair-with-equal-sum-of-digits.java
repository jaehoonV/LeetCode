class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int output = -1;
        for(int i = 0; i < n; i++){
            int temp = nums[i];
            int sum = 0;
            while(temp != 0){
                sum += temp % 10;
                temp /= 10;
            }
            if(map.containsKey(sum)){
                output = Math.max(output, map.get(sum) + nums[i]);
                if(map.get(sum) < nums[i]) map.put(sum, nums[i]);
            }else{
                map.put(sum, nums[i]);
            }
        }

        return output;
    }
}