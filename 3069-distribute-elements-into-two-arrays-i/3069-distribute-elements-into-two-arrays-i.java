class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int output[] = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>();
	    ArrayList<Integer> arr2 = new ArrayList<>();

	    arr1.add(nums[0]);
	    arr2.add(nums[1]);
        
        for(int i = 2; i < n; i++){
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        
        int j = 0;
        
        for(int i = 0; i < arr1.size(); i++){
            output[j++] = arr1.get(i);
        }
        
        for(int i = 0; i < arr2.size(); i++){
            output[j++] = arr2.get(i);
        }

	    return output;
    }
}