class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> output = new ArrayList<>();
        List<String> e_list = new ArrayList<>();
        List<String> g_list = new ArrayList<>();
        List<String> p_list = new ArrayList<>();
        List<String> r_list = new ArrayList<>();
        
        for(int i = 0; i < code.length; i++){
            if(func1(code[i]) && isActive[i]) {
                switch (businessLine[i]) {
                    case "electronics":
                        e_list.add(code[i]);
                        break;
                    case "grocery":
                        g_list.add(code[i]);
                        break;
                    case "pharmacy":
                        p_list.add(code[i]);
                        break;
                    case "restaurant":
                        r_list.add(code[i]);
                        break;
                }
            }
        }
        Collections.sort(e_list);
        Collections.sort(g_list);
        Collections.sort(p_list);
        Collections.sort(r_list);
        
        output.addAll(e_list);
        output.addAll(g_list);
        output.addAll(p_list);
        output.addAll(r_list);
        return output;
    }

    public boolean func1(String s){
        return s != null && s.matches("[a-zA-Z0-9_]+");
    }
}