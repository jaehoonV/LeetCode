class Solution {
    public int minimumChairs(String s) {
        int output = 0, i = 0, seats = 0, n = s.length();
		while(i < n){
			if(s.charAt(i) == 'E') output = Math.max(output, ++seats);
			else seats--;
			i++;
		}
		return output;
    }
}