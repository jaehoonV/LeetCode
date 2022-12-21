class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        TreeMap<Integer,String> tm = new TreeMap<>();
        for(int i = 0; i < arr.length; i++){
            String temp = arr[i];
            tm.put(Character.getNumericValue(temp.charAt(temp.length() - 1)), temp.substring(0, temp.length() - 1));
        }
        StringBuilder output = new StringBuilder();

        for(Integer i : tm.keySet()){
            output.append(tm.get(i));
            output.append(" ");
        }
        return output.toString().substring(0, output.length() - 1);
    }
}