package java.java_end_of_file;

import java.util.*;

public class Solution {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lineNumber = 0;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " " + s);
        }

    }
}
