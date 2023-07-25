class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == l - 1 || arr[mid + 1] < arr[mid])) return mid;
            else if (mid > 0 && arr[mid - 1] > arr[mid]) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }
}