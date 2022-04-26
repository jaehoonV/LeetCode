class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        if(nums.length % k != 0) return false; // nums의 길이가 k에 나눠지지 않으면 false 반환 
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for (int n : nums) { // map에 숫자 count해서 put
			map.put(n, map.getOrDefault(n, 0) + 1);
        }

		for (int i : map.keySet()) {
			int temp = map.get(i);

			if (temp == 0) // 숫자 count가 0이면 다음 숫자로 넘어감
				continue;

			for (int j = i; j < k + i; j++) { // 연속 숫자를 확인
				if (!map.containsKey(j) || map.get(j) <= 0)
					return false;
				map.put(j, map.get(j) - temp); // 처음 수의 count(temp) 만큼 빼서 put 
			}
		}

		return true;
    }
}
