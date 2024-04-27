class Solution {
    public int minimumPushes(String word) {
        int temp[] = new int[26];
        for(char c:word.toCharArray()){
            temp[c - 'a']++;
        }
        
        Arrays.sort(temp);
        
        int a = 1, output = 0, cnt = 1;
        for(int i = 25; i >= 0; i--){
            if(a <= 8) a++;
            else{
                a = 2;
                cnt++;
            }
            output += (temp[i] * cnt);
        }
        
        return output;
    }
}