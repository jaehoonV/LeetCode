class Solution {
    public int maxDivScore(int[] nums, int[] d) {
        int n = d.length;
        int max = 0;
        int index = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < n; i++){
            int a = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] % d[i] == 0) a++;
            }
            if(max < a){
                index = i;
                max = a;
            }
        }
        return d[index];
    }
}