class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] cnt = new int[10];
        for(int d : digits) cnt[d]++;

        List<Integer> list = new ArrayList<>();

        for(int i = 100; i <= 998; i += 2) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            cnt[a]--;
            cnt[b]--;
            cnt[c]--;

            if(cnt[a] >= 0 && cnt[b] >= 0 && cnt[c] >= 0) {
                list.add(i);
            }
            cnt[a]++;
            cnt[b]++;
            cnt[c]++;
        }

        int[] output = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }

        return output;
    }
}