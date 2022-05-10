class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int n_l = nums.length;
        
        if (n_l < 4) return output;
        
        for(int i=0; i < n_l-3; i++){
            for(int j=i+1; j < n_l-2; j++){
                int c = j+1, d = n_l-1;
                while(c < d){
                    int sum = nums[i]+nums[j]+nums[c]+nums[d];
                    if(sum == target){
                        List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[c],nums[d])); // list 생성
                        if(!output.contains(list)){
                            output.add(list); // list add
                        }
                        c++;
                        d--;
                        // 중복 부분 스킵
                        while (c < d && nums[c] == nums[c - 1]) {
                            c++;
                        }
                        while (c < d && nums[d] == nums[d + 1]) {
                            d--;
                        }
                    }else if(sum < target){
                        c++;
                    }else{
                        d--;
                    }
                    
                }
            }
        }
        return output;
    }
}

            