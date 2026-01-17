class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int s = 0;
        int n = bottomLeft.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int minX = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int maxX = Math.min(topRight[i][0], topRight[j][0]);
                int minY = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                int maxY = Math.min(topRight[i][1], topRight[j][1]);

                if(minX < maxX && minY < maxY) {
                    int l = Math.min(maxX - minX, maxY - minY);
                    s = Math.max(s, l);
                }
            }
        }

        return (long) s * s;
    }
}