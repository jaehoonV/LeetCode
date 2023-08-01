class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int n = hours.length;
        for(int i = 0 ; i < n; i++){
            if(target <= hours[i]) return n - i;   
        }
        return 0;
    }
}