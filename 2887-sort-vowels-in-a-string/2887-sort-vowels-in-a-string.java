class Solution {
    public String sortVowels(String s) {
        String aeiou = "AEIOUaeiou";
		int n = s.length();
		StringBuilder output = new StringBuilder();
		int[] i_arr = new int[n];
		ArrayList<String> c_list = new ArrayList<>();
		
		for(int i = 0; i < n; i++){
			String temp = String.valueOf(s.charAt(i));
			if(aeiou.contains(temp)){
				i_arr[i] = 1;
				c_list.add(temp);
			}
		}
		
		c_list.sort(Comparator.naturalOrder());
        
		int i = 0;
		int j = 0;
		while(i < n){
			if(i_arr[i] == 0){
				output.append(String.valueOf(s.charAt(i)));
			}else{
				output.append(c_list.get(j++));
			}
            i++;
		}
		
		return output.toString();
		
    }
}