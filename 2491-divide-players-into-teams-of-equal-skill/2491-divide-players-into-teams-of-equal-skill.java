class Solution {
    public long dividePlayers(int[] skill) {
    
        Arrays.sort(skill);
        int n = skill.length;
        int a = skill[0] + skill[n - 1]; 
        long output = skill[0] * skill[n - 1];

        int i = 1;
        int j = n - 2;
        
        while(i < j){
            if(skill[i] + skill[j] != a) return -1;
            
            output += skill[i++] * skill[j--];
        }
        return output;
    }
}