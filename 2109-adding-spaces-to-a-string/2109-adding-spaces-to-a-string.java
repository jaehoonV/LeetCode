class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder output = new StringBuilder();
		int index = 0;
		for(int i : spaces){
			output.append(s.substring(index, i));
			output.append(" ");
			index = i;
		}
        output.append(s.substring(index));
		return output.toString();
    }
}