class Solution {
    public int splitNum(int num) {
        
        char[] c = Integer.toString(num).toCharArray();

        Arrays.sort(c);

        int a = 0;
        int b = 0;

        int i = 0;
        int j = 0;
        while(i < c.length){
            if(j == 0){
                a = a * 10 + Character.getNumericValue(c[i]);
                j = 1;
            }else{
                b = b * 10 + Character.getNumericValue(c[i]);
                j = 0;
            }
            i++;
        }
        return a + b;
    }
}