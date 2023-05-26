class Solution {
    public String sortString(String s) {
        int[] arr = new int[27];
        String temp = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < s.length(); i++){
            int num = temp.indexOf((s.charAt(i)));
            arr[++num] = arr[num] + 1;
        }

        int len = s.length();
        int count = 0;
        StringBuilder output = new StringBuilder();
        
        while(count < len){
            for(int i = 1; i < 27; i++){
                if(arr[i] > 0){
                    output.append(temp.charAt(i - 1));
                    arr[i]--;
                    count++;
                }
            }
            for(int j = 26; j >= 1; j--){
                if(arr[j] > 0){
                    output.append(temp.charAt(j - 1));
                    arr[j]--;
                    count++;
                }
            }
        }
        return output.toString();
    }
}