class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] arr = new int[n];
        arr[0] = 1;
        int i = 0;
        int cnt = 1;
        while(true){
            int temp = (i + cnt * k) % n;
            if(arr[temp] != 2){
                arr[temp]++;
                i = temp;
                cnt++;
            }
            
            if(arr[temp] == 2) break;
        }
        ArrayList<Integer> output = new ArrayList<>();
        for(int j = 0; j < n; j++){
            if(arr[j] == 0){
                output.add(j + 1);
            }
        }
        return output.stream().mapToInt(l -> l).toArray();
    }
}