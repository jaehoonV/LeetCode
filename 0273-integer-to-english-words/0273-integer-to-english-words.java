class Solution {
    String[] arr1 = {"", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
	String[] arr2 = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
	String[] arr3 = {"","Thousand ","Million ","Billion "};
		
    public String numberToWords(int num) {
        
        if(num == 0) return "Zero";
		
        StringBuilder output = new StringBuilder(); 
        int cnt = 0;
        while(num > 0){
            String s = func(num % 1000);
            if(!s.equals("")){
                s += arr3[cnt];
                output.insert(0, s);
            }
            num = num / 1000;
            cnt++;
        }
        return output.toString().substring(0, output.length() - 1);
    }
	
    public String func(int num){
        String output = "";
        int chk_100 = num / 100;
        num %= 100;
		
		if(chk_100 > 0){
			output = arr1[chk_100] + "Hundred ";
        }
		
		if(num < 20){
			output += arr1[num];
        } else{
			output += arr2[num / 10] + arr1[num % 10];
        }
		
        return output;

    }
}