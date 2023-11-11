class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> output = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        int i = 0;
        
        for (String word : words) {
            if (word.equals("prev")) {
                i++;
                if(digits.size() - i < digits.size() && digits.size() - i >= 0){
                    output.add(Integer.parseInt(digits.get(digits.size() - i)));
                }else{
                    output.add(-1);
                }
            } else {
                digits.add(word);
                i = 0;
            }
        }
        return output;
    }
}