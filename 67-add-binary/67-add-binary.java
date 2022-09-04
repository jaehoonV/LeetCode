class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;
        while(i >= 0 || j >= 0){
            int a_int = 0;
            int b_int = 0;
            int sum = 0;
            if(i >= 0){
                a_int = Character.getNumericValue(a.charAt(i--));
            }
            if(j >= 0){
                b_int = Character.getNumericValue(b.charAt(j--));
            }
            sum = a_int + b_int + temp;
            if(sum > 2){
                temp = 1;
                sb.append("1");
            }else if(sum > 1){
                temp = 1;
                sb.append("0");
            }else if(sum > 0){
                temp = 0;
                sb.append("1");
            }else{
                temp = 0;
                sb.append("0");
            }
        }
        if(temp > 0){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}