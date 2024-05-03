class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int leng1 = arr1.length;
        int leng2 = arr2.length;
        int l = Math.max(leng1, leng2);
        
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i = 0; i < l; i++){
            if(i < leng1) temp1 = Integer.parseInt(arr1[i]);
            else temp1 = 0;
            
            if(i < leng2) temp2 = Integer.parseInt(arr2[i]);
            else temp2 = 0;
            
            if(temp1 > temp2) return 1;
            else if(temp2 > temp1) return -1;
        }
        return 0;
    }
}