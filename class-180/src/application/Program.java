package application;

import entitites.Product;
import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        String path = "C:\\Users\\caio.chaves\\Downloads\\arquivo2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
                System.out.println(line);
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: " + x);
            System.out.println(x);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
