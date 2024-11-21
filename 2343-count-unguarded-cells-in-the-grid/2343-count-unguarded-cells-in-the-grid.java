class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] temp = new int[m][n];

        for(int i = 0; i < walls.length; i++){
            temp[walls[i][0]][walls[i][1]] = 3;
        }

        for(int i = 0; i < guards.length; i++){
            temp[guards[i][0]][guards[i][1]] = 2;
        }

        for(int i = 0; i < guards.length; i++){
            int a = guards[i][0];
            int b = guards[i][1];

            int a1 = a, a2 = a;
            while(a1 < m - 1){
                a1++;
                if(temp[a1][b] == 2 || temp[a1][b] == 3) break;
                temp[a1][b] = 1;
            }
            
            while(0 < a2){
                a2--;
                if(temp[a2][b] == 2 || temp[a2][b] == 3) break; 
                temp[a2][b] = 1;
            }

            int b1 = b, b2 = b;
            while(b1 < n - 1){
                b1++;
                if(temp[a][b1] == 2 || temp[a][b1] == 3) break;
                temp[a][b1] = 1;
            }

            while(0 < b2){
                b2--;
                if(temp[a][b2] == 2 || temp[a][b2] == 3) break;
                temp[a][b2] = 1;
            }
        }

        int output = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(temp[i][j] == 0)output++;
            }
        }
        return output;
    }
}