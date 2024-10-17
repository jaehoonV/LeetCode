class Solution {
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;

        int m_i = n - 1, l = -1, r = -1;

        for (int i = n - 2; i >= 0; --i) {
            if (arr[i] > arr[m_i]) {
                m_i = i;
            } else if (arr[i] < arr[m_i]) {
                l = i;
                r = m_i;
            }
        }

        if (l == -1) return num;
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return Integer.parseInt(new String(arr));
    }
}