class Solution {
    public List<Integer> findPeaks(int[] m) {
        ArrayList<Integer> output = new ArrayList<>();
        int temp = m[0];
        for(int i = 1; i < m.length - 1; i++){
            int a = m[i];
            if(temp < a && a > m[i + 1]) output.add(i);
            temp = a;
        }
        return output;
    }
}