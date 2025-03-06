package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.copy;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> myDoubles = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);

    }
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
