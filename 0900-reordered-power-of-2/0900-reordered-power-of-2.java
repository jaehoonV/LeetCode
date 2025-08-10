class Solution {
    public boolean reorderedPowerOf2(int n) {
        String num = func(n);

        for(int i = 0; i < 31; i++){
            int t = 1 << i;
            if(func(t).equals(num)) return true;
        }

        return false;
    }

    public String func(int num){
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}