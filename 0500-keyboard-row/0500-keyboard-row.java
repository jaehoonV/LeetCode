class Solution {
    public String[] findWords(String[] words) {
        String s[] = {"qwertyuiop", "asdfghjkl", "zxcvbnm"}; 
        ArrayList<String>temp = new ArrayList<>();

        for(int i = 0; i < 3; i++){
           for(int j = 0; j < words.length; j++){
               String cs = "";
               String word = words[j].toLowerCase();
               for(int k = 0; k < word.length(); k++){
                   String c = word.charAt(k) + "";
                   if(s[i].contains(c)) cs = cs + c;
               }
               if(cs.equals(word)) temp.add(words[j]);
            }
        }
        String[] output = new String[temp.size()];
        output = temp.toArray(output);
        return output;
    }
}