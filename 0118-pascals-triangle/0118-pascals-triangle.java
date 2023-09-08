class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        output.add( Arrays.asList(1));
        if(numRows == 1) return output;
        
        temp.add(1);
        temp.add(1);
        output.add(temp);
        
        for(int i = 2; i < numRows; i++){
            List<Integer> t = new ArrayList<>();
            t.add(1);
            for(int j = 0; j < temp.size() - 1 ; j++){
                t.add(temp.get(j) + temp.get(j + 1));     
            }
            t.add(1);
            output.add(t);
            temp = t;
        }
        return output;
    }
}