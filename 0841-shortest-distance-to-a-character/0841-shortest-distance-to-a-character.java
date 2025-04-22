class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer>list = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c) list.add(i);
        }

        int output[] = new int[n];
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < list.size(); j++){
                min = Math.min(min, Math.abs(i - list.get(j)));
            }
            output[i] = min;
        }
        return output;
    }
}