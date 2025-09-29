class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();

        int temp = 1;
        while(n > 0) {
            int a = n % 10;
            if(a != 0) list.add(a * temp);
            n /= 10;
            temp *= 10;
        }
        
        int l = list.size();
        Collections.sort(list, Collections.reverseOrder());
        int[] output = new int[l];
        for(int i = 0; i < l; i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}