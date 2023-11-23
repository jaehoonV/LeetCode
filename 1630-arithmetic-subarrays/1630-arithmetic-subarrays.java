class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> output = new ArrayList();
        for (int i = 0; i < l.length; i++) {
            int[] temp = new int[r[i] - l[i] + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = nums[l[i] + j];
            }
            
            output.add(check(temp));
        }

        return output;
    }
    
    public Boolean check(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
    }
}
