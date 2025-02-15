class Solution {
    public int punishmentNumber(int n) {
        int output = 0;

        for(int i = 1; i <= n; i++){
            int temp = i * i;
            
            if(func(temp, i))
              output += temp;
        }

        return output;

    }
    public boolean func(int t, int target){
        if(t < target || target < 0) return false;
        if(t == target) return true;

        return (
            func(t / 10, target - (t % 10)) 
            || func(t / 100, target - (t % 100)) 
            || func(t / 1000, target - (t % 1000))
        );
    }
}