package java.s10_basic_statistics;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];

        double mean = 0.0d, median = 0.0, mode;

        // CALCULATING MEAN
        int i = 0, j;
        while (sc.hasNextInt()) {
            X[i] = sc.nextInt();
            mean += X[i++];
        }

        sc.close();
        mean /= n;

        // CALCULATING MEDIAN
        for (i = 0; i < n - 1; i++)
            for (j = 0; j < n - i - 1; j++)
                if (X[j] > X[j + 1]) {
                    int swap = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = swap;
                }

        if (n % 2 == 1) median = X[n / 2];
        else median = (X[n / 2 - 1] + X[n / 2]) / 2.0;

        // CALCULATING MODE
        mode = X[0];
        int[] X_occ = new int[n];
        int max_occ = 1;
        for (i = 0; i < n; i++) {
            int occ = 0;
            for (j = 0; j < n; j++)
                if (X[i] == X[j]) occ++;

            if (occ > max_occ) {
                max_occ = occ;
                mode = X[i]; // initializing mode for 2nd time
            }
            X_occ[i] = occ;
        }

        for (i = 0; i < n; i++)
            if (X_occ[i] == max_occ)
                if (X[i] < mode) mode = X[i];

        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.printf("%.1f", mode);
    }
}
