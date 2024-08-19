class Solution {
    public int minSteps(int n) {
        int output = 0;
		int t = 2;
		while(t * t <= n){
			if(n % t == 0){
				output += t;
				n /= t;
			}else {
				t++;
			}
		}
		
		if(n != 1) output += n;
       
		return output;
    }
}