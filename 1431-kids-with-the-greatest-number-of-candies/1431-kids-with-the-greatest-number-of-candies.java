class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int temp = 0;
        List<Boolean> b = new ArrayList<>();
        
        // 최대값 찾기
        for(int i : candies) {
            temp = Math.max(temp, i);
        }
        temp -= extraCandies;
        
        // 비교하면서 boolean값 add
        for(int i : candies) {
            if(i >= temp){
                b.add(true);
            } else {
                b.add(false);
            }
        }
        return b;
    }
}