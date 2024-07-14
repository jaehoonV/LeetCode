class Solution {
    public List<String> validStrings(int n) {
        List<String> output = new ArrayList<>();
        if(n == 1){
            output.add("1");
            output.add("0");
            return output;
        }

        output.add("01");
        output.add("10");
        output.add("11");

        for(int i = 3; i <= n; i++){
            List<String> temp = new ArrayList<>();
            for(String a : output){
                if(a.charAt(a.length() - 1) == '1'){
                    temp.add(a + "1");
                    temp.add(a + "0");
                }else temp.add(a + "1");
            }
            output = temp;
        }
        return output;
    }
}