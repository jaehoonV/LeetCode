class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> output = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        while(k > 0){
            queue.add(k % 10);
            k /= 10;
        }

        int i = num.length - 1; 
        int temp = 0;
        while(queue.size() > 0 || i >= 0){
            int n = temp;
            if(queue.size() > 0){
                n += queue.poll();
            }
            if(i >= 0){
                n += num[i--];
            }
            output.add(n % 10);
            if(n > 9) {
                temp = 1;
            }else{
                temp = 0;
            }
        }
        if(temp == 1) output.add(1);
        Collections.reverse(output);
        return output;
    }
}