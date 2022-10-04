class Solution {
    public int[] replaceElements(int[] arr) {
        int n = 0;
        int leng = arr.length;
        int output[] = new int[leng];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < leng; i++){
            for(int j = i + 1; j < leng; j++){
                n = Math.max(arr[j], n);
            }
            if(i == leng - 1){
                list.add(-1);
            } else{
                list.add(n);
                n =0;
            }
        }
        
        int a = 0;
        for(int l :list){
            output[a] = l;
            a++;
        }
        return output;
    }
}