package java.java_anagrams;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        int start = 0, len = a.length();
        while (start != len) {
            int aCount = 0, bCount = 0;
            for (int i = 0; i < len; i++) {
                if (
                        (a.charAt(start) + "").toLowerCase().equals(
                                (a.charAt(i) + "").toLowerCase()
                        )
                ) aCount++;

                if (
                        (a.charAt(start) + "").toLowerCase().equals(
                                (b.charAt(i) + "").toLowerCase()
                        )
                ) bCount++;
            }
            if (aCount != bCount) return false;
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}