class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return myPower(x, N);
    }

    private double myPower(double x, long n) {
        if (n == 0) return 1.0;

        //double half = myPower(x, n / 2);

        if (n % 2 == 0) {
            return myPower(x, n / 2) * myPower(x, n / 2);
        } else {
            return myPower(x, n / 2) * myPower(x, n / 2) * x;
        }
    }
}
