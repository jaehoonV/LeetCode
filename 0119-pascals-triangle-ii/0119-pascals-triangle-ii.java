class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> output = new ArrayList<>();
        long a = 1;
        output.add((int)a);
        for(int i = 0; i < rowIndex; i++) {
            a *= (rowIndex - i);
            a /= (i + 1);
            output.add((int)a);
        }
        return output;
    }
}