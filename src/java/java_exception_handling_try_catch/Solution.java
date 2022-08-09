package java.java_exception_handling_try_catch;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                int div = x / y;
                System.out.println(div);
            } catch (Exception e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }

        } catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}
