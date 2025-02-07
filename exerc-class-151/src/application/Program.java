package application;

import model.exceptions.DomainExceptions;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("Enter the account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Hulder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdrow Limit: ");
        double withdrowLimit = sc.nextDouble();




    }
}
