package intro102;

public class NumberWorker {
    

    public static void main(String[] args) {
        
        int myInteger = 5;
        long myLong = 27L;
        float myFloat = 7.5f;
        double myDouble = 53.123d;

        // In Java you can work with four different types of numbers: int, long, float, and double
        // The difference between int and long is that int is a 32-bit integer and long is a 64-bit integer
        // The difference between float and double is that float is a 32-bit floating point number and double is a 64-bit floating point number
        // You can add int and long, but the result will be a long
        // You can add int and float, but the result will be a float
        // You can add int and double, but the result will be a double
        // The order of superiority is int < long < float < double

        // You can add any two numbers of the same type or you can cast one of them to the other type and then add them
        // Casting is when you change the type of a variable
        // You can cast a double to an int by writing (int) before the variable
        // You can cast an int to a double by writing (double) before the variable

        // There are other types of numbers in Java, but they are not used as often as the four types above
        // They are also not considered primitive types. They are called wrapper classes
        
        System.out.println("my Integer is " + myInteger);
        System.out.println("my Long is " + myLong);
        System.out.println("my Float is " + myFloat);
        System.out.println("my Double is " + myDouble);

        // When casting a double to an int you will lose the decimal point and the result will be an int
        double myNewDouble = 64.3714;
        System.out.println("myNewDouble = " + myNewDouble);
        System.out.println("myNewDoble when casted to an integee: " + (int) myNewDouble);

        // You can use operators to manipulate numbers
        // The + operator can be used to add numbers
        // The - operator can be used to subtract numbers
        // The * operator can be used to multiply numbers
        // The / operator can be used to divide numbers
        // The ++ operator can be used to increment a number by 1
        // The -- operator can be used to decrement a number by 1
        // The ++ and -- operators can be used before or after the variable
        // If you use them after the variable, they will return the value before incrementing or decrementing
        // Therefore you will not see the change in the value until the next time you print it
        System.out.println(myInteger + myLong);
        System.out.println(myDouble + myFloat);
        System.out.println(myInteger * myInteger);
        System.out.println(myDouble / myInteger);
        System.out.println(myLong - myInteger);
        System.out.println(myLong % myInteger);
        System.out.println("myInteger++" + myInteger++);
        System.out.println("++myInteger" + ++myInteger);
        System.out.println(--myLong);

        // The % operator can be used to get the remainder of a division
        // The % operator will return the remainder of the division of the first number by the second number
        System.out.println("10 % 3 = " + 10 % 3);
        System.out.println("10 % 4 = " + 10 % 4);
        System.out.println("9 % 3 = " + 9 % 3);

        // When dividing two integers, the result will always be an integer
        // You should avoid dividing two integers and storing the result in an integer because you will lose the decimal part of the result
        // Here is an example of what happens when you divide two integers and store the result in an integer
        // Keep in mind that numbers declared with .0 are always doubles
        System.out.println("5 / 2 = " + 5 / 2);
        System.out.println("5 / 2.0 = " + 5 / 2.0);
        System.out.println("5.0 / 2 = " + 5.0 / 2);
        System.out.println("5.0 / 2.0 = " + 5.0 / 2.0);
    }

}
