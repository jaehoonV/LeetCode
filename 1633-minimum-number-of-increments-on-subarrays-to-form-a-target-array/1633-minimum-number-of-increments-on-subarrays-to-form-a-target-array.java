class Solution {
    public int minNumberOperations(int[] target) {
        int l = target.length, output = target[0];
        for(int i = 1; i < l; i++){
            output += Math.max(target[i] - target[i - 1], 0);
        }

        return output;
    }
}