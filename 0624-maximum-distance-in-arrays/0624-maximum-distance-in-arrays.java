class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int output = 0;

        for(int i = 1 ; i < n ; i++){
            int len = arrays.get(i).size();
            output = Math.max(output , Math.max(Math.abs(max - arrays.get(i).get(0)) , Math.abs(arrays.get(i).get(len - 1) - min)));
            min = Math.min(min , arrays.get(i).get(0));
            max = Math.max(max , arrays.get(i).get(len - 1));
        }

        return output;
    }
}