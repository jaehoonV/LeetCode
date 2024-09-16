class Solution {
    public int findMinDifference(List<String> timePoints) {
        int output = Integer.MAX_VALUE;
        List<Integer> time = new ArrayList<>();
        
        for(String tp : timePoints){
            time.add(func(tp));
        }
        
        Collections.sort(time);
        
        for(int i = 1; i < time.size(); i++){
            output = Math.min(output, time.get(i) - time.get(i - 1));
        }
        
        return Math.min(output, 1440 + time.get(0) - time.get(time.size() - 1));
        
    }
    
    public int func(String time){
        int h = Integer.parseInt(time.substring(0,2));
        int m = Integer.parseInt(time.substring(3,5));

        return h * 60 + m;
    }
}