class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int output = map.size();

        int[] countArray = new int[100000];
        for(int key : map.keySet()) {
            int cnt = map.get(key);
            countArray[cnt]++;
        }

        for (int i = 1; i < 100000; i++) {
            if (countArray[i]!= 0) {
                int temp = k / i;
                if (temp == 0) {
                    break;
                } else {
                    temp = Math.min(temp, countArray[i]);
                    output -= temp;
                    k -= temp * i;
                }
            }
        }
        return output;
    }
}