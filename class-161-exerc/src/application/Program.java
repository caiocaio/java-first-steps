package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of folder path: ");
        String strPath = sc.nextLine();

        List<Product> list = new ArrayList<Product>();

        File path = new File(strPath);

        boolean sucess = new File(strPath + "\\out").mkdir();

        File output = new File(strPath + "\\out\\summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while (line != null) {

                String[] parts = line.split(",");
                String name = parts[0];
                Double price = Double.parseDouble(parts[1]);
                Integer quanttity = Integer.parseInt(parts[2]);

                list.add(new Product(name, price, quanttity));
                line = br.readLine();

            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

                for (Product p : list) {
                    bw.write(p.getName() + "," + p.getPrice() * p.getQuantity());
                    bw.newLine();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
