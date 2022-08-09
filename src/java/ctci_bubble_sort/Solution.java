package java.ctci_bubble_sort;

import java.util.*;

public class Solution {
    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int i, j, x, nbSwaps = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    x = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = x;
                    nbSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + nbSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
