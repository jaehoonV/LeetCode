class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int l = startTime.length;
        int[] temp = new int[l + 1];
        int output = 0;

        for (int i = 0; i < l; i++) {
            temp[i + 1] = temp[i] + endTime[i] - startTime[i];
        }

        for (int i = k - 1; i < l; i++) {
            int a = temp[i + 1] - temp[i - k + 1];
            int e = (i == l - 1) ? eventTime : startTime[i + 1];
            int s = (i == k - 1) ? 0 : endTime[i - k];
            output = Math.max(output, e - s - a);
        }

        return output;
    }
}