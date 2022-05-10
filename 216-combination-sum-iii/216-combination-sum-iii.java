class Solution {
    List<List<Integer>> output = new ArrayList<>();                     
    List<Integer> list = new ArrayList<>();                              
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        find(k, n, 1);                                              
        return output;
    }
    
    // 재귀함수
    public void find(int k, int n, int start) {                      
        if(k == 0 && n == 0){ // 0조건                                             
            output.add(new ArrayList<>(list));
            return;
        }
        for(int i = start; i < 10; i++){ // start 증가하면서 반복하여 add
            list.add(i);
            find(k - 1, n - i, i + 1);
            list.remove(list.size() - 1);
        }
    }
}