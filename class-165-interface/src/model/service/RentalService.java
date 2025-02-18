package model.service;

import model.entities.Invoice;
import model.entities.Rental;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService brazilTaxService;

    public RentalService( Double pricePerHour,Double pricePerDay ,BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
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

        double tax = brazilTaxService.tax(basicPayment);

        rental.setInvoice(new Invoice(basicPayment, tax ));
    }
}
