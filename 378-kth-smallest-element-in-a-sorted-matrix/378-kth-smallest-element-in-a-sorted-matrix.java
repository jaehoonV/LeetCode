class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        // Arraytlist에 담음
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                list.add(matrix[i][j]);
            }
        }
        // 오름차순 정렬
        Collections.sort(list);
        
        return list.get(k - 1);
    }
}