package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(){

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts (int quantaty){
        this.quantity += quantaty;
    }

    public void removeProducts (int quantaty){
        this.quantity -= quantaty;
    }

    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f",totalValueInStock());
    }
}
