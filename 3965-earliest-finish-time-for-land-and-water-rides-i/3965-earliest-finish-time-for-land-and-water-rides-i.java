class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int output = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        for (int i = 0; i < n; i++) {
            int st = landStartTime[i];
            int dt = landDuration[i];

            for (int j = 0; j < m; j++) {
                int wst = waterStartTime[j];
                int wdt = waterDuration[j];

                int land = st + dt;
                int water = wst + wdt;

                int s_tWater = Math.max(land, wst) + wdt;
                int s_Land = Math.max(water, st) + dt;

                output = Math.min(output, Math.min(s_tWater, s_Land));
            }
        }

        return output;
    }
}