class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++){
			list.add(i);
		}
		int i = 1, s = 0;
		
		while(list.size() > 1){
			if(i == k){
				list.remove(s);
				i = 1;
			}else{
				i++;
				s++;
			}
			
			if(list.size() == s){
				s = 0;
			}
		}
		
		return list.get(0);
    }
}