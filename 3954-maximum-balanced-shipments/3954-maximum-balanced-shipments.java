class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int output = 0;
        int i = 0;

        while(i < n){
            int max_w = weight[i];
            int j = i;

            while(j < n){
                max_w = Math.max(max_w, weight[j]);

                if(weight[j] < max_w){
                    output++;
                    j++;
                    break;
                }

                j++;
            }

            i = j;
        }
        
        return output;
    }
}