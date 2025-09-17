class Solution {
    public int smallestAbsent(int[] nums) {
        int l = nums.length;
        Set<Integer> set = new HashSet<>();
        int a = 0;

        for(int n : nums){
            set.add(n);
            a += n;
        }
        
        double avg = (double) a / l;
        int output = (int) Math.floor(avg) + 1;
        
        if(output <= 0) output = 1;

        while(set.contains(output)){
            output++;
        }
        
        return output;
    }
}