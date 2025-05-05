class Solution {
    public int maxProduct(int n) {
        int output = 0;
        List<Integer> list = new ArrayList<>(); 
        while(n > 0){
            int t = n % 10;
            list.add(t);
            n /= 10;
        }
        int size = list.size();
        if(size == 2){
            return list.get(0) * list.get(1);
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = i + 1; j < size; j++){
                output = Math.max(output, list.get(i) * list.get(j));
            }
        }

        return output;
    }
}