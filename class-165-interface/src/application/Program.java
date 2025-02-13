package application;

import entities.Rental;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:ss");

        System.out.println("Enter Rental Data:");
        System.out.println();

        try {
            System.out.print("Car Model: ");
            String carModel = sc.nextLine();
            System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
            Date pickupDate = sdf.parse(sc.next());
            System.out.print("Return (dd/MM/yyyy hh:ss): ");
            Date returnDate = sdf.parse(sc.next());
            System.out.print("Enter price per hour: ");
            Double pricePerHour = sc.nextDouble();
            System.out.print("Enter price for days: ");
            Double priceForDays = sc.nextDouble();

            Rental rental = new Rental(carModel, pickupDate, returnDate, pricePerHour, priceForDays);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: ");
        System.out.println("Tax: ");
        System.out.println("Total payment: ");

    }
}
