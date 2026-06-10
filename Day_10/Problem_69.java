package Day_10;

public class Problem_69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int l = 1;
        int r = x;
        int ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                return mid;
            }
            if (square < x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
