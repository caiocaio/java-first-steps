package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollar = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        CurrencyConverter.dollarToReal = sc.nextDouble();

        System.out.println(CurrencyConverter.amount());

    }
}
