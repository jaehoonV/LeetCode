class Solution {
    public int earliestTime(int[][] tasks) {
        if(tasks.length == 1) {
            int sum = 0;
            for(int t : tasks[0]) sum += t;
            return sum;
        }

        int min_task = 0;
        for(int t : tasks[0]) min_task += t;

        for(int i = 1; i < tasks.length; i++) {
            int sum = 0;
            for(int t : tasks[i]) sum += t;
            if(sum < min_task) min_task = sum;
        }

        return min_task;
    }
}