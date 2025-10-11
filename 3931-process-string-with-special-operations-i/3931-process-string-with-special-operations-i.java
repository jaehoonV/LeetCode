class Solution {
    public String processStr(String s) {
        List<Character> list = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c != '*' && c != '#' && c != '%'){
                list.add(c);
            }else if(c == '#'){
                List<Character> copy = new ArrayList<>(list);
                list.addAll(copy);
            }else if(c == '%'){
                Collections.reverse(list);
            }else{
                if(!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }
        }

        StringBuilder otput = new StringBuilder();
        for(char c : list){
            otput.append(c);
        }
        return otput.toString();
    }
}