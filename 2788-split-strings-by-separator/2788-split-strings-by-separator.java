class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> output = new ArrayList<>();
        String c = separator + "";
        
        for(String s : words){
            System.out.println(s);
            int i = 0;
            int j = 0;
            int n = s.length();
            while(i <= n){
                if(i == n || s.charAt(i) == separator){
                    if(i != j) output.add(s.substring(j, i));
                    i++;
                    j = i;
                } else i++;
            }
        }
        return output;
    }
}