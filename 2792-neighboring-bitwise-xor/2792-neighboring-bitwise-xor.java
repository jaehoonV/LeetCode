class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        int[] temp = new int[n];

        for(int i = 1; i < n; i++){
            temp[i] = derived[i - 1] ^ temp[i - 1];
        }

        for(int i = 0; i < n; i++){
            int j = (i + 1) % n;
            if(derived[i] != (temp[i] ^ temp[j])) return false;
        }

        return true;
    }
}