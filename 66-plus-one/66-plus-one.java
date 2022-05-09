class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        
        while(i >= 0){ // + 1
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
            }
            i--;
        }
        if(i < 0){ // 자릿수가 넘어간 경우(길이 + 1)배열 생성
            int ans[] = new int[digits.length + 1];
            ans[0] = 1;
            int j = 1;
            for(int d : digits){
                ans[j++] = d;
            }
            return ans;
        }else return digits;
    
    }
    
}