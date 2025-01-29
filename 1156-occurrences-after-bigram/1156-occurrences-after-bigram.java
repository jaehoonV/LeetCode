class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> output = new ArrayList<>();
        String[] arr = text.split(" ");

        for(int i = 2; i < arr.length; i++){
            if(first.equals(arr[i - 2]) && second.equals(arr[i - 1])){
                output.add(arr[i]);
            }
        }
        return output.toArray(new String[output.size()]);
    }
}