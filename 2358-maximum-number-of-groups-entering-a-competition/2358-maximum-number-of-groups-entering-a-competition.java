class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int t_n = n;
        int a = 1;
        int max_cnt = 0;
        while(t_n > 0){
            t_n -= a++;
            if(t_n >= 0){
                max_cnt++;
            }
        }
        
        Arrays.sort(grades);
        
        int i = 1; // index
        int j = 2; // 길이 저장
        int sum = grades[0]; // 합계
        int cnt = 1;
        
        while(i < n){
            int temp = 0;
            for(int k = 0; k < j; k++){
                if(i < n - 1){
                    temp += grades[i++];
                }else{
                    i++;
                }
            }
            j++;
            if(sum < temp){
                sum = temp;
                cnt++;
            }
        }    
        return cnt > max_cnt ? max_cnt : cnt;
    }
}