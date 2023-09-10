class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.size(); i++){
            int a = nums.get(i).get(0);
            int b = nums.get(i).get(1);
            while(a <= b){
                set.add(a++);
            }
        }
        return set.size();
    }
}