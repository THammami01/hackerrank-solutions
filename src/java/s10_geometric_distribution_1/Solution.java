package java.s10_geometric_distribution_1;

public class Solution {
    public static void main(String[] args) {
        double p = 1.0d / 3.0d;
        int defect = 5;

        System.out.format("%.3f%n", Math.pow(1 - p, defect - 1) * p);
    }
}
