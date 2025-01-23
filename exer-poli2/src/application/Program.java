package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        int n = sc.nextInt();

        List <Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY)");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }else {
                System.out.print("Custons fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();


    }
}
