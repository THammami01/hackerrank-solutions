package java._30_2d_arrays;

import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max_sum = arr[0][0] + arr[0][1] + arr[0][2] +
                arr[1][1] +
                arr[2][0] + arr[2][1] + arr[2][2];

        for (int sum, l = 0; l < (6 - 2); l++) {
            for (int r = 0; r < (6 - 2); r++) {
                sum = arr[l][r] + arr[l][r + 1] + arr[l][r + 2] +
                        arr[l + 1][r + 1] +
                        arr[l + 2][r] + arr[l + 2][r + 1] + arr[l + 2][r + 2];

                if (sum > max_sum)
                    max_sum = sum;
            }
        }

        System.out.println(max_sum);

        scanner.close();
    }
}
