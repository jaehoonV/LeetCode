class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 1 ; i <= n; i++){
			int sum = sum_func(i);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		int output = 0;
		int max = 0;
		for (int v : map.values()) {
			if(max < v){
				output = 1;
				max = v;
			}else if(max == v){
				output++;
			}
        }
		
        return output;
    }

    public int sum_func(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}