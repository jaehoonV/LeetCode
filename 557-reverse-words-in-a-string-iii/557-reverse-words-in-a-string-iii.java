class Solution {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();

        String[] str = s.split(" ");

        for(int i = 0; i < str.length; i++){
	        StringBuilder sb = new StringBuilder(str[i]);
	        output.append(sb.reverse().toString());
	        if(i != str.length - 1) output.append(" ");
        }
        return output.toString();
    }
}