class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        int n = nums.length;
        int[] temp = new int[1001];
        
        for(int[] arr : nums){
            for(int a : arr){
                temp[a]++;
            }
        }
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == n) output.add(i);
        }
        return output;
    }
}