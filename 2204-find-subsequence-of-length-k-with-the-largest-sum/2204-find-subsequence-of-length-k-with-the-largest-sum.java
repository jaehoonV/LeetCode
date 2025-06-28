class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<int[]> pairs=new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            pairs.add(new int[]{nums[i], i});
        }
        pairs.sort((a,b) -> Integer.compare(b[0],a[0]));

        List<int[]> temp=new ArrayList<>(pairs.subList(0, k));
        temp.sort((a, b) -> Integer.compare(a[1], b[1]));

        int output[] = new int[k];
        for(int i = 0; i < k; i++){
            output[i] = temp.get(i)[0];
        }
        return output;
    }
}