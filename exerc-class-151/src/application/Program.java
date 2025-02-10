package application;

import model.entities.Account;
import model.exceptions.DomainExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        try {
            System.out.println("Enter the account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdrow Limit: ");
            double withdrowLimit = sc.nextDouble();
            Account acc = new Account(number, holder, balance, withdrowLimit);
            System.out.println("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n ", acc.getBalance());
        }
        catch (DomainExceptions e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
