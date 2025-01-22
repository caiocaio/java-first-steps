package application;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+ 1) + "data:");
            System.out.print("Outsorced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            double hours = sc.nextDouble();
            System.out.print("Valeu per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                //Funcionario func = new FuncionarioTercerizado(name, hours, valuePerHour, additionalCharge);
                list.add(new FuncionarioTercerizado(name, hours, valuePerHour, additionalCharge));
            }else {
                //Funcionario func = new Funcionario(name, hours, valuePerHour);
                list.add(new Funcionario(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");

        for (Funcionario func : list){
            System.out.println(func.getName() + "- $" + String.format("%.2f", func.payment()));
        }

    }
}
