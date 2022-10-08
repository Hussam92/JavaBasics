package intro103;

/**
 * Booleans are a special type of variable that can only be true or false
 * Booleans are called booleans because they were named after George Boole
 * George Boole was an English mathematician who created Boolean algebra
 * Boolean algebra is a type of algebra that uses only true and false
 * 
 * Booleans are used to represent conditions
 * Booleans ar an essential part of programming because they are used to control the flow of the program
 */
public class BooleanOperator {
    

    public static void main(String[] args) {
        
        // Boolean variables can be declared like any other variable
        // Booleans are either true or false
        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myTrueBoolean is " + myTrueBoolean);
        System.out.println("myFalseBoolean is " + myFalseBoolean);

        // You can use the ! operator to negate a boolean
        // The ! operator will return the opposite of the boolean
        System.out.println("myTrueBoolean is not " + !myTrueBoolean);
        System.out.println("myFalseBoolean is not " + !myFalseBoolean);

        // You can use the && operator to check if two booleans are both true
        // The && operator will return true if both booleans are true
        System.out.println("&& Are both booleans true? " + (myTrueBoolean && myFalseBoolean));

        // You can use the || operator to check if either of two booleans are true
        // The || operator will return true if either of the booleans are true
        System.out.println("|| Is at least one boolean true? " + (myTrueBoolean || myFalseBoolean));

        // You can use the ^ operator to check if only one of two booleans is true
        // The ^ operator will return true if only one of the booleans is true
        System.out.println("^ Is only one boolean true? " + (myTrueBoolean ^ myFalseBoolean));


        // You can use the == operator to check if two variables are equal
        // The == operator will return true if the two variables are equal
        System.out.println("== Are the two booleans equal? " + (myTrueBoolean == myFalseBoolean));

        // You can use the != operator to check if two variables are not equal
        // The != operator will return true if the two variables are not equal
        System.out.println("!= Are the two booleans not equal? " + (myTrueBoolean != myFalseBoolean));

        // The == and != operators can be used with any type of variable 
        // Let's compare some numbers

        System.out.println("Let's compare some numbers");

        int numberFive = 5;
        int numberTen = 10;
        int numberFour = 4;
        
        System.out.println("== Are numberFive and numberTen equal? " + (numberFive == numberTen));
        System.out.println("!= Are numberFive and numberTen not equal? " + (numberFive != numberTen));

        // You can use the > operator to check if a variable is greater than another variable
        // The > operator will return true if the first variable is greater than the second variable
        System.out.println("> Is numberFive greater than numberFour? " + (numberFive > numberFour));

        // You can use the < operator to check if a variable is less than another variable
        // The < operator will return true if the first variable is less than the second variable
        System.out.println("< Is numberFive less than numberFour? " + (numberFive < numberFour));

        // You can use the >= operator to check if a variable is greater than or equal to another variable
        // The >= operator will return true if the first variable is greater than or equal to the second variable
        System.out.println(">= Is numberFive greater than or equal to numberFour? " + (numberFive >= numberFour));
        System.out.println(">= Is numberFour greater than or equal to numberFour? " + (numberFour >= numberFour));

        // You can use the <= operator to check if a variable is less than or equal to another variable
        // The <= operator will return true if the first variable is less than or equal to the second variable
        System.out.println("<= Is numberFive less than or equal to numberFour? " + (numberFive <= numberFour));
        System.out.println("<= Is numberFive less than or equal to numberFive? " + (numberFive <= numberFive));

        // You can combine mathematic operators with boolean operators
        // Let's check if numberFive is equal to numberFour plus 1
        System.out.println("== Is numberFive equal to numberFour plus 1? " + (numberFive == numberFour + 1));
        
        // Let's check if numberTen is divisible by nuberFive
        System.out.println("% Is numberTen divisible by numberFive? " + (numberTen % numberFive == 0));
        // The % operator is often used to check if a number is odd or even
        // If a number is divisible by 2 then it is even
        System.out.println("% Is numberTen even? " + (numberTen % 2 == 0) + " (divisible by 2)");
        System.out.println("% Is numberFive odd? " + (numberFive % 2 != 0) + " (not divisible by 2)");


        System.out.println("Let's compare some strings");
        // The == and != operators can be used with strings and other data types as well
        // Let's compare some strings
        String myString = "Hello";
        String myOtherString = "Welcome";

        System.out.println("== Are myString and myOtherString equal? " + (myString == myOtherString));
        System.out.println("!= Are myString and myOtherString not equal? " + (myString != myOtherString));


    }
}
