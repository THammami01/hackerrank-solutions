package java.java_currency_formatter;

import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // String res;
        // String p = payment + "";
        // String fRes = p.substring(p.indexOf('.')).substring(0, 3);
        // p = p.substring(0, p.indexOf('.'));

        // res = p.substring(0, p.length() % 3);
        // p = p.substring(p.length() % 3);

        // while(p.length() != 0) {
        //     res = res + "," + p.substring(0, 3);
        //     p = p.substring(3);
        // }

        // if(res.charAt(0) == ',') res = res.substring(1);

        // res = res;

        // System.out.println("US: $" + res + fRes);
        // System.out.println("India: Rs." + res + fRes);
        // System.out.println("China: ￥" + res + fRes);
        // System.out.println("France: " + res.replace(',', ' ')
        //    + "," + fRes.substring(1) + " €");

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String us = currencyFormatter.format(payment);

        locale = new Locale("ch", "China");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String ch = currencyFormatter.format(payment);

        locale = new Locale("fr", "France");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        String fr = currencyFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: Rs." + us.substring(1));
        System.out.println("China: ￥" + ch.substring(2));
        System.out.println("France: " + fr.substring(0, fr.length()-1) + "€");
    }
}
