class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while(i < pushed.length && j < popped.length){
            if(pushed[i] == popped[j]){
                i++;
                j++;
            }else if(arr.size() != 0 && arr.get(arr.size() - 1) == popped[j]){
                arr.remove(arr.size() - 1);
                j++;
            }else{
                arr.add(pushed[i++]);
            }
        }
        
        while(j < popped.length){
            if(arr.size() != 0 && arr.get(arr.size() - 1) == popped[j]){
                arr.remove(arr.size() - 1);
                j++;
            }else{
                break;
            }
        }
        
        return arr.size() == 0 ? true : false;
    }
}