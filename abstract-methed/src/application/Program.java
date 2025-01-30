package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shapes");
        int n = sc.nextInt();

        List <Shape> list = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            System.out.print("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED)");
            Color color = Color.valueOf(sc.next());
            if ( ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }
            else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

            System.out.println();
            System.out.println("Shape areas:");
            for (Shape shape : list){
                System.out.println(shape.area());
                System.out.println(String.format("%.2f", shape.area()));
            }

        }
    }
}
