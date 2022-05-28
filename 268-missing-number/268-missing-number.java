class Solution {
    // contains lambda 방식  Time Limit Exceeded
//     public int missingNumber(int[] nums) {
        
//         for(int i = 0; i <= nums.length; i++){
//             if(!contains(nums, i)) return i;
//         }
        
//         return 0;
//     }
    
//     public boolean contains(int[] nums, int key) { // Lambda
//         return Arrays.stream(nums).anyMatch(i -> i == key);
//     }
// ------------------------------------------------------------    
    // sum 방식
//     public int missingNumber(int[] nums) {
        
//         Arrays.sort(nums);
//         int n = nums[nums.length-1];
        
//         // 가우스 덧셈
//         int n_sum = (1+n)*(n/2)+(n%2==0?0:(1+n)/2); 
        
//         // stream() method 
//         int nums_sum = Arrays.stream(nums).parallel().reduce(0,(a,b)->  a + b);
        
//         if(n_sum - nums_sum == 0 && nums[0] == 0) return n+1;
        
//         return n_sum - nums_sum == 0 ? 0 : n_sum - nums_sum;
//     }
// ------------------------------------------------------------   
    //binary search
    public int missingNumber(int[] nums) { 
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid= (left + right)/2;
        
        while(left<right){
            mid = (left + right)/2;
            if(nums[mid]>mid) right = mid;
            else left = mid+1;
        }
        
    return left;
    }
    
}