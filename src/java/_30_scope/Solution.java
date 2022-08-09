package java._30_scope;

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        for (int e1 : elements)
            for (int e2 : elements)
                if (Math.abs(e1 - e2) > maximumDifference)
                    maximumDifference = Math.abs(e1 - e2);
    }
} // End of Difference class

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
