package java.s10_binomial_distribution_1;

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

    public static void main(String[] args) {
        int n = 6;
        double p = 1.09 / 2.09;
        double q = 1.0 - p;

        double probability = 0.0;

        for (int x = 3; x <= 6; x++)
            probability += comb(n, x) * Math.pow(p, x) * Math.pow(q, 6 - x);

        System.out.format("%.3f", probability);
    }
}
