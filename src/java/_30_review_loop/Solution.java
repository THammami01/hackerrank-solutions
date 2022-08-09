package java._30_review_loop;

import java.util.Scanner;

public class Solution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            for (int j = 0; j < word.length(); j += 2)
                System.out.print(word.charAt(j));
            System.out.print(" ");
            for (int j = 1; j < word.length(); j += 2)
                System.out.print(word.charAt(j));
            System.out.println();
        }
    }
}
