class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length;
        int n = score[0].length;
        
        int[][] output = new int[m][n];
        
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < m; i++){
            hm.put(i,score[i][k]);
        }
        List<Integer> keySetList = new ArrayList<>(hm.keySet());
        Collections.sort(keySetList, (o1, o2) -> (hm.get(o2).compareTo(hm.get(o1))));
        
        int a = 0;
        for (Integer key : keySetList) {
            for(int j = 0; j < n; j++){
                output[a][j] = score[key][j];
            }
            a++;
        }
        return output;
    }
}