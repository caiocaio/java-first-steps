package application;

import entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How man employees will be registered? ");
        int n = sc.nextInt();

        List<Employees> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+ 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employees emp = new Employees(id, name, salary);
            list.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increse: ");
        int idsalary = sc.nextInt();

        Employees employee = findById(list, idsalary);
        if(employee != null ){
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }else{
            System.out.print("This id not exist!");
        }

        System.out.println();
        System.out.println("List of employees");
        for (Employees emp : list){
            System.out.println(emp);
        }
        sc.close();
    }

    private static Employees findById(List<Employees> list, int id) {
        for (Employees employees : list){
            if (employees.getId() == id){
                return employees;
            }
        }
        return null;
    }
}
