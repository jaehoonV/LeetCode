class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<String> arr = new ArrayList<>();

        for(String t : tokens){
            arr.add(t);
        }

        return func(arr);
    }

    public int func(ArrayList<String> arr){
        if(arr.size() == 1) return Integer.parseInt(arr.get(0));

        ArrayList<String> next_arr = new ArrayList<>();
        boolean c1 = false;
        boolean c2 = true;
        for(int i = 0; i < arr.size(); i++){
            int temp = 0;
            if(!c1) {
                int n = next_arr.size();
                if("+".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) + Integer.parseInt(arr.get(n - 1));
                    c1 = true;
                }else if("-".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) - Integer.parseInt(arr.get(n - 1));
                    c1 = true;
                }else if("*".equals(arr.get(i))) {
                    temp = Integer.parseInt(next_arr.get(n - 2)) * Integer.parseInt(arr.get(n - 1));
                    c1 = true;
                }else if("/".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) / Integer.parseInt(arr.get(n - 1));
                    c1 = true;
                }
            }
            if(c1 && c2) {
                next_arr.remove(next_arr.size() - 1);
                next_arr.remove(next_arr.size() - 1);
                next_arr.add(String.valueOf(temp));
                c2 = false;
            } else{
                next_arr.add(arr.get(i));
            }
        }
        return func(next_arr);
    }
}