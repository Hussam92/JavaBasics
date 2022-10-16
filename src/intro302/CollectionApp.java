package intro302;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import intro201.Square;

public class CollectionApp {
    
    public static void main(String[] args) {
        
        // Create a integer array from 1 to 10 with initialized values 
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("\nDone");

        // Convert the array to a ArrayList
        // You can convert the array to a list by using the following method
        // Streams allow you to convert the array to a stream and manipilate it in many ways
        // boxed method converts the primitive array to a List of Integer
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        // Print the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " - ");
        }
        System.out.println("\nDone");

        // Multiply each number by 2
        // You can use the map method to apply a function to each element of the stream
        list = list.stream().map(i -> i * 2).collect(Collectors.toList());

        // Print the list
        // Inside the forEach you can see something called a lambda expression
        // It is a way to pass a function as a parameter
        // In the example before i -> i * 2 is also a lambda expression
        list.stream().forEach(i -> System.out.print(i + " - "));

        // You can use the map function to transform a value to a different type/object
        List<Square> squareList = list.stream().map(i -> new Square((double) i)).collect(Collectors.toList());
        squareList.stream().forEach(System.out::println);

        // Creata a List of Integers with the numbers from 1 to 50
        // Hint: use IntStream 
        List<Integer> intList = IntStream.range(1, 51).boxed().collect(Collectors.toList());
        // Print even numbers
        System.out.println("Even numbers:");
        intList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        // Print numbers dividable by 3
        System.out.println("Numbers dividable by 3:");
        intList.stream().filter(i -> i % 3 == 0).forEach(System.out::println);
        // Print numbers dividable by 5
        System.out.println("Numbers dividable by 5:");
        intList.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
        // Print numbers dividable by 3 and 5
        System.out.println("Numbers dividable by 3, 5 or both:");
        intList.stream().filter(i -> i % 3 == 0 || i % 5 == 0).forEach(System.out::println);
        // Print all numbers, if its dividable by 3, print foo, if its dividable by 5, print bar, if its dividable by 3 and 5, print foobar
        System.out.println("Numbers with foo, bar and foobar:");
        intList.stream().forEach(i -> System.out.println(
            (i % 3 == 0 ? "foo" : "") + 
            (i % 5 == 0 ? "bar" : "") + 
            (i % 3 != 0 && i % 5 != 0 ? i : "")
        ));
        System.out.println("Numbers with foo, bar and foobar:");

        // Print all numbers that are prime
        System.out.println("Prime numbers:");
        intList.stream().filter(i -> isPrime(i)).forEach(System.out::println);
    }

    // a function that determines if a number is a prime
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printOneTimesOneTable() {
        // Print the entire 1 times 1 table

        // Create a list of integers from 1 to 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Create a list of strings from 1 to 10
        List<String> strings = numbers.stream().map(i -> i.toString()).collect(Collectors.toList());

        // Print the entire 1 times 1 table
        strings.stream().forEach(i -> {
            strings.stream().forEach(j -> {
                System.out.print(i + " * " + j + " = " + Integer.parseInt(i) * Integer.parseInt(j) + "\t");
            });
            System.out.println();
        });

        // Loop through the numbers 1 to 1000 and print if that number is prime
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
            }
        }
    }
}
