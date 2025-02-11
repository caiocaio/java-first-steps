package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File output = new File("C:\\Users\\Caio\\Desktop\\arquivo2.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(path));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
            
            String line = br.readLine();
            while (line != null) {
                
              String[] parts = line.split(",");
               if (parts.length == 3) {
                   String name = parts[0];
                   Double price = Double.parseDouble(parts[1]);
                   Integer amount = Integer.parseInt(parts[2]);
                   
                   double result = price * amount;

                   bw.write(name + "," + result);
                   bw.newLine();
               }
              
              line = br.readLine();
            }
            System.out.println("Arquivo 2 criado com sucesso!");

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
