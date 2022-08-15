class Solution {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();

		int output = 0;
		
		for(int i = 0; i<=s.length()-1; i++) {
			switch(arr[i]) {
				case 'I' : output+=1;
					break;
				case 'V' : output+=5;
					break;
				case 'X' : output+=10;
					break;
				case 'L' : output+=50;
					break;
				case 'C' : output+=100;
					break;
				case 'D' : output+=500;
					break;
				case 'M' : output+=1000;
					break;
			}
		}
		
		if(s.contains("IV"))
			output-=2;
		if(s.contains("IX"))
			output-=2;
		if(s.contains("XL"))
			output-=20;
		if(s.contains("XC"))
			output-=20;
		if(s.contains("CD"))
			output-=200;
		if(s.contains("CM"))
			output-=200;
        
        return output;
    } 
}