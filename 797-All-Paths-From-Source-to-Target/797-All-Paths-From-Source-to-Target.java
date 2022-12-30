class Solution {

    ArrayList<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] g) {
        int n = g.length - 1;
        
        for(int i = 0; i < g[0].length; i++){            
            ArrayList<Integer> t = new ArrayList<>(Arrays.asList(0));
            t.add(g[0][i]);
            func(g, g[0][i], t, n);
        }
        return output;
    }

    public void func(int[][] g, int a, List<Integer> t, int n){
        if(t.contains(n)) {
            output.add(t);
            return;
        }
        
        for(int i = 0; i < g[a].length; i++){         
            if(!t.contains(g[a][i])){
                ArrayList<Integer> temp = new ArrayList<>(t);
                temp.add(g[a][i]);
                func(g, g[a][i], temp, n);
            }
        }
    }
}