package java._30_binary_numbers;

import java.util.*;

public class Solution {
    private static String getBin(int n) {
        String b = "";
        // int m = 1;
        while (n != 0) {
            // b += n % 2 * m;
            b += (n % 2);
            // m *= 10;
            n = n / 2;
        }
        return b;
    }

    private static int getMaxCons1s(String b) {
        int max = 0;
        for (String s : b.split("0"))
            if (s.length() > max) max = s.length();
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // String b = getBin(n);
        // System.out.println(b);
        System.out.println(getMaxCons1s(getBin(n)));
        scanner.close();
    }
}
