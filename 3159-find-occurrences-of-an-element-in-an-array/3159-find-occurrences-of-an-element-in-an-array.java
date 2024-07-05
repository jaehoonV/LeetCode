class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            if(x == nums[i]) temp.add(i);
        }
        
        n = queries.length;
        int output[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            int q = queries[i];
            output[i] = q > temp.size() ? -1 : temp.get(q - 1);
        }
        
        return output;
    }
}