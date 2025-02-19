class Solution {
    List<String> output = new ArrayList<>();
    char[] char_arr = {'a', 'b', 'c'};
    int l;

    public String getHappyString(int n, int k) {
        l = n;
        func("");
        return k > output.size() ? "" : output.get(k - 1);
    }

    public void func(String s){
        if(s.length() == l){
            output.add(s);
            return;
        }
        for(char c: char_arr){
            if(s.isEmpty() || s.charAt(s.length() - 1) != c){
                func(s + c);
            }
        }
    }
    
}