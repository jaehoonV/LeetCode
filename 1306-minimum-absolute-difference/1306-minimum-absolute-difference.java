class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> output = new ArrayList<>();
        
        for(int i = 0; i < n - 1; i++){
            int m = Math.abs(arr[i] - arr[i + 1]);
            if(min >= m){
                if(min > m){
                    min = m;
                    output.clear();
                }
                List<Integer> temp = new ArrayList<>();
                output.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
            }

        }
        
        return output;
    }
}