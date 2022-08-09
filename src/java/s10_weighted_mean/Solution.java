package java.s10_weighted_mean;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        int[] W = new int[n];
        double weighted_mean = 0.0d;
        int sum_weights = 0;

        int i;
        for (i = 0; i < n; i++)
            X[i] = sc.nextInt();
        sc.nextLine();
        for (i = 0; i < n; i++)
            W[i] = sc.nextInt();

        for (i = 0; i < n; i++) {
            weighted_mean += X[i] * W[i];
            sum_weights += W[i];
        }
        weighted_mean /= sum_weights;

        System.out.printf("%.1f", weighted_mean);
    }
}
