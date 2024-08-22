class Solution {
    public int findComplement(int num) {
        String output = "";
		String num_2 = Integer.toBinaryString(num);
		
		for(char c : num_2.toCharArray()){
			if(c == '0') output += "1";
			else output += "0";
		}
		
		return Integer.parseInt(output, 2);
    }
}