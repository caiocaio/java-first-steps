package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.widht = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        if(retangulo.widht == retangulo.height){
            System.out.println("Its a cUaDrAdO");
        }else {

            System.out.printf("AREA = %.2f%n", retangulo.area());
            System.out.printf("PERIMETER = %.2f%n", retangulo.perimeter());
            System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
            sc.close();
        }
    }
}
