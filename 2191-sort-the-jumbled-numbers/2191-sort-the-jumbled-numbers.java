class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int mappedA = func(a, mapping);
                int mappedB = func(b, mapping);
                return Integer.compare(mappedA, mappedB);
            }
        });

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

    public int func(int num, int[] mapping) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(num);
        
        for (char digit : s.toCharArray()) {
            sb.append(mapping[digit - '0']);
        }
        return Integer.parseInt(sb.toString());
    }
}