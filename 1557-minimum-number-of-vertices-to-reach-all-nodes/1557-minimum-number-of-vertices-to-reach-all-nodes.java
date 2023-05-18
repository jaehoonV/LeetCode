class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] temp = new int[n];
        
        for(List<Integer> list : edges){
            temp[list.get(1)]++;
        }
        
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(temp[i] == 0){
                output.add(i);
            }
        }
        return output;
    }
}