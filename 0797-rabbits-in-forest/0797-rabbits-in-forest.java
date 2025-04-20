class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int output = 0, cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 0) {
                output++;  
            }else if(i == 0 || answers[i] != answers[i - 1] || cnt == 0) {
                output += answers[i] + 1;  
                cnt = answers[i];
            }else {
                cnt--;  
            }
        }
        return output;
    }
}