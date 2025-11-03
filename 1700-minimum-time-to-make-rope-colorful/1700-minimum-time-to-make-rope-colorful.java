class Solution {
    public int minCost(String colors, int[] neededTime) {
        char temp = colors.charAt(0);
		int n = colors.length();
		int a = 0;
		int b = 0;
		boolean bool = true;
		int output = 0;
		for(int i = 1; i < n; i++){
			if(temp == colors.charAt(i)){
				if(bool){
					a = i - 1; 
					bool = false;
				}
				b = i;
			}else{
				output += func(neededTime, a, b);
				bool = true;
				a = 0;
				b = 0;
				temp = colors.charAt(i);
			}
		}
		
		if(!bool){
			output += func(neededTime, a, n - 1);
		}
		
		return output;
    }
	
	public int func(int[] neededTime, int a, int b) {
		int hap = 0;
		int maxTime = 0; 
		for(int i = a; i <= b; i++){
			if (neededTime[i] > maxTime) {
				maxTime = neededTime[i];
			}
			hap += neededTime[i];
		}
		hap -= maxTime;

		return hap;
    }
}