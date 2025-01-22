class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int c : candyType) set.add(c);
        int size = set.size();
        return size < n ? size : n;
    }
}