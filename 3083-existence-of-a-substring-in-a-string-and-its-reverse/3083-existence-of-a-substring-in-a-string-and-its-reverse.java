class Solution {
    public boolean isSubstringPresent(String s) {
        int n = s.length(), i = 0;
        
        StringBuffer sb = new StringBuffer(s);
        String reversedS = sb.reverse().toString();
        
        while(i < n - 1){
            if(s.contains(reversedS.substring(i, i + 2))) return true;
            i++;
        }
        
        return false;
    }
}