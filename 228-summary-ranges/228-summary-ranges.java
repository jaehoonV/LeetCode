class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        ArrayList<String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        
        while(i < n) {
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            int j = i;
            while (i < n - 1 && nums[i+1] == nums[i] + 1) 
                i++;
            if (i != j) { 
                sb.append("->" + nums[i]);
            }
            list.add(sb.toString());
            i++;
        }
        return list;
    }
   
}