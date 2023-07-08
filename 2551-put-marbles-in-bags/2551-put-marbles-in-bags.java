class Solution {
    public long putMarbles(int[] weights, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i < weights.length; i++){
            arr.add(weights[i] + weights[i - 1]);
        }
        Collections.sort(arr);
        
        long min = 0, max = 0;
        int a = arr.size() - 1;
        for(int i = 1; i < k; i++){
           min += arr.get(i - 1);
           max += arr.get(a--);
        }
        
        return max - min;
    }
}