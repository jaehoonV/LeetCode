class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int num : arr) {
            Set<Integer> t = new HashSet<>();
            t.add(num);
            for (int x : b) {
                t.add(x | num);
            }
            b = t;
            a.addAll(b);
        }
        return a.size();
    }
}