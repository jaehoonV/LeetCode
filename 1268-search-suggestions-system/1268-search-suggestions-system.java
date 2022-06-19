class Solution {
    ArrayList<String> arrlist = new ArrayList<>();
	List<List<String>> outputlist = new ArrayList<>();
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
		Arrays.sort(products); // 정렬
		for(String s : products) { // 검색할 리스트
			arrlist.add(s);
		}
		
		for(int i = 1; i <= searchWord.length(); i++) {
			String word = searchWord.substring(0, i); // 검색어 설정
			outputAdd(arrlist, word); // 검색 리스트
		}
		
		return outputlist;
	}

	public void outputAdd(ArrayList<String> arrlist2, String word) {
		ArrayList<String> temp = new ArrayList<>();
		char[] c = word.toCharArray();
		for (String s : arrlist2) {
			boolean b = true; // 문자 비교 boolean
			for (int i = 0; i < c.length; i++) {
				if (s.length() > i) {
					if (s.charAt(i) != c[i]) { // 문자 비교 틀릴 경우 false
						b = false;
						break;
					}
				} else {
					b = false;
				}
			}
			if (b) // 문자 맞을경우 add
				temp.add(s);
		}

		// 초기화하고 arrlist를 temp로 저장
		arrlist.clear();
		arrlist = temp;
		outputlist.add(makelist(temp));
	}
	
	// 3개 이하로 뽑아줌
	public List<String> makelist(ArrayList<String> temp) {
		List<String> output = new ArrayList<>();
		for(int i = 0; i < temp.size(); i++) {
			if(i > 2) break;
			output.add(temp.get(i));
		}
		return output;
	}
}