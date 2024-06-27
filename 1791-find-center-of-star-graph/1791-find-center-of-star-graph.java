class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
		int n = edges.length;
		
		for(int i = 0; i < n; i++){
			if(set.contains(edges[i][0])) return edges[i][0];
			else set.add(edges[i][0]);
			
			if(set.contains(edges[i][1])) return edges[i][1];
			else set.add(edges[i][1]);
		}
		
		return -1;
    }
}