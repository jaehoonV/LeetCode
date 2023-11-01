/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int a = 1;
        if (isBadVersion(a)) return 1;

        while (n > a) {
            if (n - a == 1) break;
            if (isBadVersion((n - a) / 2 + a)) n = (n - a) / 2 + a;
            else a = (n - a) / 2 + a;
        }
        return n;
    }
}