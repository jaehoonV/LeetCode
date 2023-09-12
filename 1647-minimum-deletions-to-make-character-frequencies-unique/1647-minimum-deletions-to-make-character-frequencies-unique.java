class Solution {
    public int minDeletions(String s) {
        int[] arr = new int[26];
		int output = 0;
        for(char key : s.toCharArray()) arr[key - 97]++;
		
		Arrays.sort(arr);
		int t = arr[25];
		for(int i = 24; i >= 0; i--){
			int a = arr[i];
			if(t == 0 && a == 0) break;
			
			while(t <= a){
                if(t == 0 && a == 0) break;
				output++;
				a--;
			}
			t = a < 0 ? 0 : a;
		}
        return output;
    }
}