package application;

import model.entities.Car;
import model.entities.Rental;
import model.service.BrazilTaxService;
import model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter Rental Data:");
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), sdf);
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), sdf);

        Rental cr = new Rental(new Car(carModel), start , finish);

        System.out.print("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Enter price for days: ");
        Double pricePerDays = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDays, new BrazilTaxService());

        rentalService.processeInvoice(cr);

        System.out.println("Invoice: ");
        System.out.println("Basic Payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("Tax: " + cr.getInvoice().getTax());
        System.out.println("Total Payment " + cr.getInvoice().getTotalPayment());

    }
}
