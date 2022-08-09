package java._30_loops;

import java.util.*;

public class Solution {
    public static void printMT(int n) {
        for (int i = 1; i < 11; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printMT(n);
        scanner.close();
    }
}
