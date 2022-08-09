package java.s10_geometric_distribution_2;

public class Solution {
    public static void main(String[] args) {
        double p = 1.0d / 3.0d;
        int defect = 5;
        double res = 0.0d;

        for (int i = 1; i <= defect; i++)
            res += Math.pow(1 - p, i - 1) * p;

        System.out.format("%.3f", res);
    }
}
