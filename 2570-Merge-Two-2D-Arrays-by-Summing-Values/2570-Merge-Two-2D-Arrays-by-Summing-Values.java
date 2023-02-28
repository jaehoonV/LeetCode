class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i][0], nums1[i][1]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i][0])){
                map.put(nums2[i][0], map.get(nums2[i][0]) + nums2[i][1]);
            }else{
                map.put(nums2[i][0], nums2[i][1]);
            }
        }

        int[][] output = new int[map.size()][2];
        
        Iterator<Integer> keys = map.keySet().iterator();
        int i = 0;
        while(keys.hasNext()){
            int key = keys.next();
            output[i][0] = key;
            output[i][1] = map.get(key);
            i++;
        }
        
        return output;
    }
}