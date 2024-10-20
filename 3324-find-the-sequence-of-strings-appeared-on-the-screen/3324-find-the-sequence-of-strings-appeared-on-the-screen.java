class Solution {
    public List<String> stringSequence(String target) {
        List<String> output = new ArrayList<>();
        output.add("a");
        String temp = "a";
        int i = 0;
        while(true){
            if(temp.equals(target)) break;
            if(target.charAt(i) == temp.charAt(i)){
                temp += "a";
                i++;
            }else{
                char c = temp.charAt(i);
                c++;
                temp = temp.substring(0, i) + c;
            }
            output.add(temp);
            
        }
        
        return output;
    }
}