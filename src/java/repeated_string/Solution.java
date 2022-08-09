package java.repeated_string;

import java.io.*;
import java.util.*;

public class Solution {
    static int countA(String s) {
        int i, count = 0;
        for (i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a') count++;
        return count;
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int l = s.length();
        long nbRep = n / l;
        int lenLast = (int) (n % l);
        return countA(s) * nbRep + countA(s.substring(0, lenLast));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
