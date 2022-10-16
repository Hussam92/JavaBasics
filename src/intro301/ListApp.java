package intro301;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import intro201.*;

/**
 * Lists are a essential part of programming
 * This class shows how to implement standard Lists from the Java Library
 */
public class ListApp {
    public static void main(String[] args) {
        
        // Create a list of Strings using ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        for (String string : list) {
            System.out.print(string + " - ");
        }
        System.out.println("\nDone");

        list.add("Auf wiedersehen");
        list.add(1, "Intruder");
        list.add("Bis bald");

        for (String string : list) {
            System.out.print(string + " - ");
        }
        System.out.println("\nDone");

        // Create a list of integers using LinkedList
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        for (Integer integer : list2) {
            System.out.print(integer + " - ");
        }
        System.out.println("\nDone");

        int sum = 0;
        for (Integer integer : list2) {
            sum += integer;
        }

        System.out.println("Sum: " + sum);

        // Calculate the average of the list2
        double average = (double) sum / list2.size();
        System.out.println("Average: " + average);

        list2.remove(0);
        list2.remove((Integer)20);


        for (Integer integer : list2) {
            System.out.print(integer + " - ");
        }
        System.out.println("\nDone");

        // You can also create Lists of Objects instead of Lists of primitive types
        // We will use our shapes from before
        List<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(new Circle(1.0));
        shapeList.add(new Square(2.0));
        shapeList.add(new Rectangle(3.0, 4.0));
        shapeList.add(new Octagon(4.0));

        for (Shape shape : shapeList) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("- - - - -");
        }
    }
}
