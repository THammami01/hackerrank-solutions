package java.sock_merchant;

import java.io.*;
import java.util.*;

public class Solution {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int i, j, nb_matches = 0;
        boolean match;
        for (i = 0; i < n; i++) {
            if (ar[i] != 0) {
                for (j = i + 1, match = false; j < n; j++) {
                    if (ar[i] == ar[j] && ar[j] != 0) {
                        match = true;
                        break;
                    }
                }
                if (match) {
                    nb_matches++;
                    ar[i] = 0;
                    ar[j] = 0;
                }
            }
        }

        return nb_matches;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
