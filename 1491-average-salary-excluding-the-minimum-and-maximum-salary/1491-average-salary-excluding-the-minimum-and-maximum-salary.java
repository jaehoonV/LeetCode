class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int s : salary) {
            min = Math.min(min, s); // 최소값 저장
            max = Math.max(max, s); // 최대값 저장
            sum += s; // 합계
        }
        // 합계에서 최대값과 최소값을 빼고 (개수-2)로 나눔
        return (sum - min - max) / (salary.length - 2);
    }
}