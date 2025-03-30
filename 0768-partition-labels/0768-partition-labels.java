class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> output = new ArrayList<>();
        int index = 0, temp = 0;

        for(int i = 0; i < n; i++) {
            temp = Math.max(temp, map.get(s.charAt(i)));
            if(i == temp) {
                output.add(temp - index + 1);
                index = i + 1;
            }
        }

        return output;
    }
}