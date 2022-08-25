class Solution {
    public boolean canConstruct(String r, String m) {
        int r_length = r.length();
        int m_length = m.length();
        if(r_length > m_length) return false;
        
        int[] temp = new int[26];
        
//         for(int i = 0; i < r_length; i++){
//             temp[r.charAt(i) - 'a']++;
//         }
//         for(int j = 0; j < m_length; j++){
//             temp[m.charAt(j) - 'a']--;
//         }
        
//         for(int k = 0; k < temp.length; k++){
//             if(temp[k] > 0) return false;
//         }
        
        for (int i = 0; i < m_length; i++) {
            temp[m.charAt(i) - 'a']++;
        }
        for (int i = 0; i < r_length; i++) {
            if(--temp[r.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}