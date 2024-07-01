class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
		
		for(int a : arr){
			if(a % 2 ==1) cnt++;
			else cnt = 0;
			
			if(cnt > 2) return true;
		}
		
		return false;
    }
}