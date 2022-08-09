package java.java_static_initializer_block;

import java.util.*;

public class Solution {
    public static int B, H;
    public static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try {
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
            flag = true;
        } catch (Exception e) {
            flag = false;
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
