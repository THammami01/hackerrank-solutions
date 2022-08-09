package java.s10_poisson_distribution_1;

public class Solution {
    public static void main(String[] args) {
        double avg = 2.5d;
        int k = 5;

        System.out.format("%.3f", Math.pow(avg, k) * Math.exp(-avg) / fact(k));
    }

    public static int fact(int n) {
        if (n == 0) return 1;
        else return n * fact(n - 1);
    }
}
