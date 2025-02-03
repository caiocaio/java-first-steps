package application;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program!");
    }

    public static void method1(){
        System.out.println("*** METHOD1 START***");
        method2();
        System.out.println("*** METHOD1 END***");
    }

    public static void method2(){
        System.out.println("*** METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
            //Stack trace é o caminho de onde está o problema.
            //	at application.Program.method2(Program.java:26)
            //	at application.Program.method1(Program.java:15)
            //	at application.Program.main(Program.java:9)
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error");
        };
        System.out.println("*** METHOD2 END***");
    }
}
