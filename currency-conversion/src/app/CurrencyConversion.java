package app;

import java.util.Scanner;
import java.util.Locale;
import model.CurrencyConverter;

public class CurrencyConversion {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollars, dollarsPrice;
        System.out.print("What is the dollar price? ");
        dollarsPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        dollars = sc.nextDouble();
        System.out.println(CurrencyConverter.converter(dollars, dollarsPrice));
        sc.close();
    }
}