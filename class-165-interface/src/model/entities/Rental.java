package model.entities;

import model.service.BrazilTaxService;

import java.time.LocalDateTime;


public class Rental {

    public LocalDateTime start;
    public LocalDateTime finish;
    private Invoice invoice;

    private Car car;

    public Rental(Car car, LocalDateTime finish, LocalDateTime start) {
        this.car = car;
        this.finish = finish;
        this.start = start;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }
}
