class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        temp.add(1);
        output.add(temp);
        
        if(numRows == 1) return output; // 1인경우 바로 return
        
        temp1.add(1);
        temp1.add(1);
        output.add(temp1); // 1, 1
        
        for(int i = 2; i < numRows; i++){
            List<Integer> t = new ArrayList<>();
            t.add(1); // 0 , 마지막 index는 1
            for(int j = 0; j < temp1.size() - 1 ; j++){
                t.add(temp1.get(j) + temp1.get(j + 1));     
            }
            t.add(1); // 0 , 마지막 index는 1
            output.add(t); // 저장 
            temp1 = t;
        }
        return output;
    }
}