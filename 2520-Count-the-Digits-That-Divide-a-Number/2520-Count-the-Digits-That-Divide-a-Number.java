class Solution {
    public int countDigits(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 0;
        int temp_num = num;
        while(temp_num != 0){
            int temp = temp_num % 10;
            arr.add(temp);
            temp_num /= 10;
        }
        
        for (int i = 0; i < arr.size(); ++i) {
            if(num % arr.get(i) == 0) cnt++;
        }
        
        return cnt;
    }
}