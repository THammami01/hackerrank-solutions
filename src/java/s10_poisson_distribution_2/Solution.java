package java.s10_poisson_distribution_2;

public class Solution {

    public static void main(String[] args) {
        double A = 0.88d;
        double B = 1.55d;

        System.out.format("%.3f\n", 160 + 40 * expectation(A));
        System.out.format("%.3f", 128 + 40 * expectation(B));
    }

    public static double expectation(double lambda) {
        return lambda + (lambda * lambda);
    }
}
