class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            int temp = 0;
            int j = 0;
            while(j < n){
                temp += nums[j];
                if(temp > queries[i]){
                    break;
                }
                j++;
            }
            arr.add(j);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}