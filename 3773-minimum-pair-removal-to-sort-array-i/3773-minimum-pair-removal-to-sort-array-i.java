class Solution {
    public int minimumPairRemoval(int[] nums) {
        int output = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int n : nums){
            temp.add(n);
        }
        
        while(!func(temp)){
            int sum = Integer.MAX_VALUE;
            int temp_i = 0;

            for(int i = 0; i < temp.size() - 1; i++) {
                int t = temp.get(i) + temp.get(i + 1);
                if (t < sum) {
                    sum = t;
                    temp_i = i;
                }
            }

            temp.set(temp_i, temp.get(temp_i) + temp.get(temp_i + 1));
            temp.remove(temp_i + 1);
            output++;
            
        }
        
        return output;
    }

    public boolean func(List<Integer> temp) {
        for (int i = 1; i < temp.size(); i++) {
            if (temp.get(i) < temp.get(i - 1)) return false;
        }
        return true;
    }
}