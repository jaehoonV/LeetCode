class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n < 3) return nums; // 2자리 아래는 바로 반환
        
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        
        int output[] = new int[n];
        for(int i = 0; i < n; i++){
            if (i % 2 == 0) 
                even.add(nums[i]);
            else 
                odd.add(nums[i]);
        }
        // 정렬
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
		
        // 배열로 저장후 반환
        int j=0;
        int k=0;
        for(int i = 0; i < n; i++){
             if (i % 2 == 0) 
               output[i]=even.get(j++);
             else 
               output[i]=odd.get(k++);
        }
        return output;
    }
}
