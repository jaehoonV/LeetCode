class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        List<Integer> con1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> con2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        
        for(int n : nums1){
            if(!(con2.contains(n) || arr1.contains(n))) arr1.add(n);
        }
        
        for(int n : nums2){
            if(!(con1.contains(n) || arr2.contains(n))) arr2.add(n);
        }
        
        List<List<Integer>> output = new ArrayList<>();
        output.add(arr1);
        output.add(arr2);
        
        return output;
    }
}