package java.s10_binomial_distribution_2;

public class Solution {

    static int fact(int n) {
        if (n <= 0) return 1;
        for (int i = n - 1; i >= 1; i--)
            n *= i;

        return n;
    }

    static double comb(int n, int r) {
        return (fact(n) / (fact(r) * fact(n - r)));
    }

    static double binomial(int n, int x, double p) {
        return comb(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    public static void main(String[] args) {
        double p = 0.12;
        int n = 10;

        double res = 0;
        for (int x = 0; x <= 2; x++)
            res += binomial(n, x, p);

        System.out.format("%.3f%n", res);

        System.out.format("%.3f", 1 - res + binomial(n, 2, p));
    }
}
