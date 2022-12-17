class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<String> arr = new ArrayList<>();

        for(String s : tokens){
            arr.add(s);
        }

        return func(arr);
    }

    public int func(ArrayList<String> arr){
        if(arr.size() == 1) return Integer.parseInt(arr.get(0));

        ArrayList<String> next_arr = new ArrayList<>();
        boolean check1 = false;
        boolean check2 = true;
        for(int i = 0; i < arr.size(); i++){
            int temp = 0;
            if(!check1) {
                int n = next_arr.size();
                if("+".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) + Integer.parseInt(arr.get(n - 1));
                    check1 = true;
                }else if("-".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) - Integer.parseInt(arr.get(n - 1));
                    check1 = true;
                }else if("*".equals(arr.get(i))) {
                    temp = Integer.parseInt(next_arr.get(n - 2)) * Integer.parseInt(arr.get(n - 1));
                    check1 = true;
                }else if("/".equals(arr.get(i))) {
                    temp = Integer.parseInt(arr.get(n - 2)) / Integer.parseInt(arr.get(n - 1));
                    check1 = true;
                }
            }
            if(check1 && check2) {
                next_arr.remove(next_arr.size() - 1);
                next_arr.remove(next_arr.size() - 1);
                next_arr.add(String.valueOf(temp));
                check2 = false;
            } else{
                next_arr.add(arr.get(i));
            }
        }
        return func(next_arr);
    }
}