class Solution {
    public boolean halvesAreAlike(String s) {
    int a = 0;
    String check = "aeiouAEIOU";
    int n = s.length();

    for(int i = 0; i <n / 2;  i++){
        char c = s.charAt(i); 
        if(check.contains(String.valueOf(c))) a++;
    }

    for(int j = n / 2; j < n;  j++){
        char c = s.charAt(j); 
        if(check.contains(String.valueOf(c))) a--;
    }
    return a == 0 ? true : false;
    }
}