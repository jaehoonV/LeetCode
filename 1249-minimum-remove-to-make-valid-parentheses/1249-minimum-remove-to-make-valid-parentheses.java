class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length(), t = 0;

        String output;
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (arr[i] == '(') t++;
            else if (arr[i] == ')') {
                if (t == 0) arr[i] = '*';
                else t--;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (t > 0 && arr[i] == '(') {
                arr[i] = '*'; 
                t--;
            }
        }
        
        int q = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != '*') arr[q++] = arr[i];
        }

        return new String(arr).substring(0, q);
    }
}