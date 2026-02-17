class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> output = new ArrayList<>();
        
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 60; j++) {
                int cnt = Integer.bitCount(i) + Integer.bitCount(j);
                if(turnedOn == cnt) {
                    String time = i + ":" + (j < 10 ? "0" + j : j);
                    output.add(time);
                }
            }
        }
        
        return output;
    }
}