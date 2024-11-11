class Solution {
    List<Integer> temp;
    public boolean primeSubOperation(int[] nums) {
        temp = new ArrayList<>();

        Loop1:for (int i = 2; i <= 1000 ; i++ ) {
            int cnt = 0;
            for (int j = 1; j < i; j++ ) {
                if(i % j == 0 ) cnt++;
                if(cnt > 1) continue Loop1;
            }
            temp.add(i);
        }

        int n = nums.length;
        int a = 0, b = 0;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] >= nums[i + 1]){
                a = nums[i] - (nums[i + 1] - 1);
                b = nums[i];

                int c = func(a, b);
                if(b == c) return false;
                else nums[i] -= c;
                
            }
        }

        return true;
    }

    public int func(int a, int b){
        for(int i = 0; i < temp.size(); i++){
            int t = temp.get(i);
            if(a <= t && t < b) return t;
        }
        return b;
    }
}