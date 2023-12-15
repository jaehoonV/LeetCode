class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();  
        for(int i = 0; i < paths.size(); i++){
           map.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        for(String k : map.keySet()){
           String s = map.get(k);
           if(!map.containsKey(s)) return s;
        }

        return " ";
    }
}