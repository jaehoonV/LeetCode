class Solution {
    public List<String> cellsInRange(String s) {
        char[] arr = s.toCharArray();
        List<String> output = new ArrayList<>();
        for(char c = arr[0]; c <= arr[3]; c++){
            for(char n = arr[1]; n <= arr[4]; n++){
                output.add(c + "" + n);
            }
        }
        return output;
    }
}