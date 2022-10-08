package intro105;

/**
 * Loops are used to repeat a block of code until a condition is met
 * You can use self defined loops or loop through arrays, collections, and other list-like data structures
 * 
 */
public class LoopingLui {
    
    public static void main(String[] args) {
        

        // There are two types of loops: while loops and for loops
        // While loops will repeat a block of code until a condition is met
        // For loops will repeat a block of code a set number of times

        // Let's start with a while loop
        // A while loop will repeat a block of code until a condition is met
        // The condition is checked before the block of code is executed
        // If the condition is true, the block of code will be executed
        // If the condition is false, the block of code will not be executed and the loop will end
        // The block of code will be executed again if the condition is still true 
        
        int counter = 0;
        while (counter < 10) {
            System.out.println("Counter is " + counter);
            counter++;
        }
        System.out.println("Counter is " + counter + " and the loop is done");

        // The do while loop is similar to the while loops except that the condition is checked after the block of code is executed
        int newCounter = 0;
        do {
            System.out.println("New counter is " + newCounter);
            newCounter++;
        } while (newCounter < 10);
        System.out.println("New counter is " + counter + " and the loop is done");

        do {
            System.out.println("Extra do-while: New counter is " + newCounter);
            newCounter++;
        } while (newCounter < 10);
        System.out.println("New counter is already 10 and the loop is done");
        System.out.println("New counter is " + newCounter + " because it was incremented one more time in the do while loop");

        // One example why you should use do while loops is when you want to execute a block of code at least once
        // For example, if you want to ask the user for input until they enter a valid input


        // For loops are used to repeat a block of code a set number of times
        // For loops are often used to loop through arrays, collections, and other list-like data structures
        // Let's loop through an array of strings

        String[] myStringArray = {"Hello", "World", "!"};
        
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

        // The syntax for a for loop is:
        // for (initialization; condition; increment) {

        // The initialization is where you define the variable that will be used to keep track of the number of times the loop has been executed
        // The condition is where you define the condition that will be checked before the block of code is executed
        // The increment is where you define how the variable will be incremented after the block of code is executed
        // The increment is usually i++ but it can be any valid expression

        // Here is another example of a for loop

        for (int i = 0; i < 10; i++) {
            System.out.println("i is " + i);
        }

        // Here is an example of a for loop that will skip every other item

        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println("Only even:: i is " + i);
        }

        // Instead of looping with fori, you can also loop with a for each loop
        // A for each loop will loop through each element in an array, collection, or other list-like data structure
        for (String listItemString : myStringArray) {
            System.out.println("For each: " + listItemString);
        }

        // The syntax for a for each loop is:
        // for (type variableName : arrayName) {
        
        // The type is the type of the array
        // The variableName is the name of the variable that will be used to store the current element in the array
        // The arrayName is the name of the array that will be looped through
    }
}
