package java.java_string_reverse;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPal = true;
        for (int i = 0, j = A.length() - 1; i <= j; i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                isPal = false;
                break;
            }
        }
        System.out.println(isPal ? "Yes" : "No");
    }
}
