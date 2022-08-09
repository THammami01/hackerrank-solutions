package java.jumping_on_the_clouds;

import java.io.*;
import java.util.*;

public class Solution {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int curr = 0, nbJumps = 0;
        while (curr != c.length) {
            try {
                if (c[curr + 2] == 0) curr += 2;
                else curr++;
            } catch (Exception e) {
                curr++;
            }

            nbJumps++;
        }
        return nbJumps - 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
