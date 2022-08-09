package java.s10_standard_deviation;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        int i = 0;
        double mean = 0.0d;
        while (sc.hasNextInt()) {
            X[i] = sc.nextInt();
            mean += X[i++];
        }
        mean /= n;

        double std_deviation = 0.0d;
        for (int x : X)
            std_deviation += Math.pow(x - mean, 2);
        std_deviation /= n;
        std_deviation = Math.sqrt(std_deviation);

        System.out.printf("%.1f", std_deviation);
    }
}
