class Solution {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        // 위,왼쪽 모서리는 1가지 방법밖에 없음
        for(int i = 0; i<m;i++){
            map[i][0] = 1;
        }
        for(int j= 0;j<n;j++){
            map[0][j]=1;
        }
        // 1,1 부터 도달할 수 있는 방법 저장
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                map[i][j] = map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}