class Solution {
    public String reverseWords(String s) {
        StringBuilder output = new StringBuilder();

        String[] str = s.split(" ");
        int n = str.length;
        for(int i = 0; i < n; i++){
	        StringBuilder sb = new StringBuilder(str[i]);
	        output.append(sb.reverse().toString());
	        if(i != n - 1) output.append(" ");
        }
        return output.toString();
    }
}