package java.s10_interquartile_range;

import java.util.*;

public class Solution {
    public static void sortArrays(int[] X, int[] F) {
        for (int i = 0, swap = 0; i < X.length - 1; i++)
            for (int j = 0; j < X.length - i - 1; j++)
                if (X[j] > X[j + 1]) {
                    swap = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = swap;
                    swap = F[j];
                    F[j] = F[j + 1];
                    F[j + 1] = swap;
                }
    }

    public static int sumFrequencies(int[] F) {
        int sum = 0;
        for (int f : F) sum += f;
        return sum;
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
        sc.nextLine();
        int[] X = new int[n], F = new int[n];

        int i;
        for (i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        sc.nextLine();

        for (i = 0; i < n; i++) {
            F[i] = sc.nextInt();
        }

        sortArrays(X, F);

        int newN = sumFrequencies(F);
        int[] newSet = new int[newN];
        i = 0;
        for (int j = 0; j < n; j++) {
            for (int freq = 0; freq < F[j]; freq++) {
                newSet[i++] = X[j];
            }
        }

        double q1, q3;
        int end_left = newSet.length / 2 - 1;
        int start_right = newSet.length % 2 == 0
                ? newSet.length / 2
                : newSet.length / 2 + 1;

        q1 = calcMedian(newSet, 0, end_left);
        q3 = calcMedian(newSet, start_right, newSet.length - 1);

        System.out.println(q3 - q1);
    }
}
