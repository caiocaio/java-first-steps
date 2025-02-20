package application;

import model.entities.Contract;
import model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter the data of contract: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Date: (dd/MM/yyyy): )");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.println("Value of contract: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Enter the number of installments");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(null);

         contractService.processContract(contract, n);

        System.out.println("Installments: ");


        sc.close();
    }
}
