class Solution {
    public boolean detectCapitalUse(String word) {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if(word.charAt(0) - 'a' > 0){
            b = true;
        } else{
            a = true;
            c = true;
        }
        for(int i = 1; i < word.length(); i++){
            if(a){
                if(word.charAt(i) - 'A' > 25){
                    a = false;
                } else{
                    c = false;
                }
            }
            if(b){
                if(word.charAt(i) - 'a' < 0){
                    return false;
                }
            }
            if(c){
                if(word.charAt(i) - 'a' < 0 && !a){
                    return false;
                }
            }
        }

        return (a || b || c) ? true : false;
    }
}