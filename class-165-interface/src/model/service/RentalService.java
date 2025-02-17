package model.service;

import model.entities.Invoice;
import model.entities.Rental;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService brazilTaxService;

    public RentalService( Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = brazilTaxService;
    }

    public void processeInvoice(Rental rental) {
        rental.setInvoice(new Invoice( ));
    }
}
