class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] check = new int[10];
        
        for(int i = 0; i < 9; i++){
            Arrays.fill(check, 0);
            for(int j = 0; j < 9; j++){
                int temp = charToInt(board[i][j]);
                if(temp != 0){
                    if(check[temp] == 0 && temp != 0){
                        check[temp] = 1;
                    }else{
                        return false;
                    }
                }
            }
        }
        
        for(int i = 0; i < 9; i++){
            Arrays.fill(check, 0);
            for(int j = 0; j < 9; j++){
                int temp = charToInt(board[j][i]);
                if(temp != 0){
                    if(check[temp] == 0){
                        check[temp] = 1;
                    }else{
                        return false;
                    }
                }
            }
        }
        
        for(int i = 0; i < 9; i++){
            if(i % 3 == 0){
                Arrays.fill(check, 0);
                for(int j = i; j < i + 3; j++){
                    for(int k = 0; k < 3; k++){
                        int temp = charToInt(board[j][k]);
                        if(temp != 0){
                            if(check[temp] == 0){
                                check[temp] = 1;
                            }else{
                                return false;
                            }
                        }
                    }
                }
                Arrays.fill(check, 0);
                for(int j = i; j < i + 3; j++){
                    for(int k = 3; k < 6; k++){
                        int temp = charToInt(board[j][k]);
                        if(temp != 0){
                            if(check[temp] == 0){
                                check[temp] = 1;
                            }else{
                                return false;
                            }
                        }
                    }
                }
                Arrays.fill(check, 0);
                for(int j = i; j < i + 3; j++){
                    for(int k = 6; k < 9; k++){
                        int temp = charToInt(board[j][k]);
                        if(temp != 0){
                            if(check[temp] == 0){
                                check[temp] = 1;
                            }else{
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public int charToInt(char a){
        int output = 0;
        if(a != '.'){
            output = a - '0';
        }
        return output;
    }
}