package application;


import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank bank;

        System.out.print("Ender account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a inicial deposit (Y/N)?");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter inicial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            bank = new Bank(number, holder, inicialDeposit);
        }else {
            bank = new Bank(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(bank);

    }
}
