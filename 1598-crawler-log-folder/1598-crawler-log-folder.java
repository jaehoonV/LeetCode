class Solution {
    public int minOperations(String[] logs) {
        int output = 0;
        
        for (String log : logs) {
            if (log.equals("../")) {
                if (output > 0) output--;
            } else if (!log.equals("./")) {
                output++;
            }
        }
        
        return output;
    }
}