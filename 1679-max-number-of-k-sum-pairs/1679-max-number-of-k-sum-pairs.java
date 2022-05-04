class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
	    int cnt = 0;
		for(int i=0;i<nums.length;i++){
            if(hm.containsKey(k-nums[i])&&hm.get(k-nums[i])>0){ // k-num값을 가지고 있을 경우
                cnt++; // 카운트
                hm.put(k-nums[i],hm.get(k-nums[i])-1); // k-num의 value -1로 저장
            }else{ // k-num값을 가지고 있지 않을 경우
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1); // 해당 num을 키 값으로 value는 횟수로 저장
            }
        }
		return cnt;
    }
}