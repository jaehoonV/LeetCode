class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        int n = nums.length;
        int temp = 0;
        boolean b = false;
        for(int i = 0; i < n; i++){
            if(b) temp = i;
            if(i + 1 < n && nums[i] + 1 == nums[i + 1]) {
                b = false;
            }else{
                if(temp == i) output.add(nums[temp] + "");
                else output.add(nums[temp] + "->" + nums[i]);
                b = true;
            }
        }
        return output;
    }
}