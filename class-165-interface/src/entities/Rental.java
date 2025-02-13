package entities;

import java.util.Date;

public class Rental {

    private String carModel;
    private Date pickupDate;
    private Date returnDate;
    private Double pricePerHour;
    private Double pricePerDay;


    public Rental(String carModel, Date pickupDate, Date returnDate, Double pricePerHour, Double priceForDays) {
        this.carModel = carModel;
        this.pickupDate = pickupDate;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.returnDate = returnDate;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
