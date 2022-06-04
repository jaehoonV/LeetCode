class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int dup=0; // 중복 값
        
        // HashSet에 담음, 중복 값 따로 저장
        for(int n : nums){
            if(hs.contains(n))
                dup=n;
            hs.add(n);
        }
        
        // 1부터 검색
        for(int i=1;i<=nums.length;i++){
            if(!hs.contains(i)) // i가 없다면 배열로 중복 값과 같이 반환
                return new int[]{dup,i};
        }
        
        return new int[]{};
    }
}