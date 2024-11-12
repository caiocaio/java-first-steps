package entities;

public class Retangulo {

    public double widht;

    public double height;

    public double area(){
        return widht * height;
    }

    public double perimeter(){
        return 2 * (widht + height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(widht, 2));
    }


}
