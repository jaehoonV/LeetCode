class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int l = rectangles.length;
        int[][] x = new int[l][2];
        int[][] y = new int[l][2];

        for (int i = 0; i < l; i++) {
            x[i][0] = rectangles[i][0];
            x[i][1] = rectangles[i][2];
            y[i][0] = rectangles[i][1];
            y[i][1] = rectangles[i][3];
        }

        return func(x) || func(y);
    }

    public boolean func(int[][] arr){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int cnt = 0;
        int temp = arr[0][1];

        for (int[] a : arr) {
            if (temp <= a[0]) cnt++;
            temp = Math.max(temp, a[1]);
        }

        return cnt >= 2;
    }
}