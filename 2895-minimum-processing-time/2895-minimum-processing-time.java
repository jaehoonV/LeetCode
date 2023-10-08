class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int n = processorTime.size();
        Collections.sort(tasks);
        Collections.sort(processorTime, Collections.reverseOrder());

        int output = 0, a = 0;

        for(int i = 0; i < n; i++){
            for(int j = 1; j <= 4; j++){
                output = Math.max(output, processorTime.get(i) + tasks.get(a));
                a++;
            }
        }
        return output;
    }
}