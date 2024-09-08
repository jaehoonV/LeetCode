class Solution {
    public String convertDateToBinary(String date) {
        String[] split_date = date.split("-");
        
        return Integer.toBinaryString(Integer.parseInt(split_date[0])) + "-" + Integer.toBinaryString(Integer.parseInt(split_date[1])) + "-" + Integer.toBinaryString(Integer.parseInt(split_date[2]));
    }
}