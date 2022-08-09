package java._30_conditional_statements;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void printWNW(int n) {
        if (n % 2 == 1)
            System.out.println("Weird");
        else if (n == 2 || n == 4)
            System.out.println("Not Weird");
        else if (n % 2 == 0 && n >= 6 && n <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        printWNW(N);
        scanner.close();
    }
}
