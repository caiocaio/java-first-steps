package model.service;

import model.entities.Invoice;
import model.entities.Rental;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService TaxService;

    public RentalService( Double pricePerHour,Double pricePerDay ,TaxService TaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.TaxService = TaxService;
    }

    public void processeInvoice(Rental rental) {

        double minuts = Duration.between(rental.getStart(), rental.getFinish()).toMinutes();
        double hours = minuts / 60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24.0) ;
        }

        double tax = TaxService.tax(basicPayment);

        rental.setInvoice(new Invoice(basicPayment, tax ));
    }
}
