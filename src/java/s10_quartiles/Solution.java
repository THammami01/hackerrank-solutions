package java.s10_quartiles;

import java.util.*;

public class Solution {
    public static void sortArray(int[] X) {
        for (int i = 0; i < X.length - 1; i++)
            for (int j = 0; j < X.length - i - 1; j++)
                if (X[j] > X[j + 1]) {
                    int swap = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = swap;
                }
    }

    public static double calcMedian(int[] X, int start, int end) {
        int len = end - start + 1;
        if (len % 2 == 0) {
            return (X[start + len / 2 - 1] + X[start + len / 2]) / 2.0;
        } else return X[start + len / 2];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
        int i = 0;
        while (sc.hasNextInt()) {
            X[i++] = sc.nextInt();
        }

        sortArray(X);

        double q1, q2, q3;
        int end_left = X.length / 2 - 1;
        int start_right = X.length % 2 == 0
                ? X.length / 2
                : X.length / 2 + 1;

        q1 = calcMedian(X, 0, end_left);
        q2 = calcMedian(X, 0, X.length - 1);
        q3 = calcMedian(X, start_right, X.length - 1);

        System.out.println((int) q1);
        System.out.println((int) q2);
        System.out.println((int) q3);
    }
}
