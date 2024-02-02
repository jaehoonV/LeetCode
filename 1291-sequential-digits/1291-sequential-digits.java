class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> output = new ArrayList<>();
        
        for (int i = 1; i <= 9; i++) {
            int num = i;
            int digit = i + 1;

            while (num <= high && digit <= 9) {
                num = num * 10 + digit;
                if (low <= num && num <= high) {
                    output.add(num);
                }
                digit++;
            }
        }
        
        Collections.sort(output);
        
        return output;
    }
}