class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < sb.length(); i++){
            arr.add(Character.getNumericValue(sb.charAt(i)));
        }

        return arr.stream().mapToInt(i->i).toArray();
    }
}