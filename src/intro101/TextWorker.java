package intro101;

/**
 * Java is a strongly typed language. This means that variables have a specific type
 * You can't assign a string to an integer variable or vice versa
 * Java is also a statically typed language. This means that the type of a variable can't change
 * You can't change a string variable to an integer variable
 */
public class TextWorker {
    
    /**
     * This is the main method. It is the entry point of the program
     * This means that the program starts executing from this method
     * The main method is static. This means that it can be called without creating an instance of the class
     * The main method is void. This means that it doesn't return anything
     * The main method takes a single argument. This is an array of strings
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
         * 
         * Lines of code that start with // are comments. They are ignored by the compiler
         * The compiler is the program that translates your code into machine code
         * The machine code is what the computer actually runs
         * Comments are useful for explaining what your code does
         * They are also useful for temporarily disabling code
         * You can also start comments with /* and end them with * / like this
         */

        // Strings are declared with double quotes. They can be printed with System.out.println
        // You can declare parameters with any name you want
        // You can name them whatever you want as long as they are not reserved words
        // Reserved words are words that have a special meaning in Java
        String myName = "Hussam";

        // You can print strings and other types of data with System.out.println
        // The shortcut for System.out.println is sout
        System.out.println(myName);

        // Strings can be concatinated with the + operator. This is called string interpolation
        System.out.println("Hello, my name is " + myName);


        // Strings can be manipulated with different methods. For example, toUpperCase() will make the string all uppercase
        System.out.println(myName.toUpperCase() + " is my name in all caps");
        System.out.println(myName.toLowerCase() + " is my name in all lowercase");
        System.out.println(myName.length() + " is the length of my name");
        System.out.println(myName.charAt(0) + " is the first character of my name");
        System.out.println(myName.charAt(myName.length() - 1) + " is the last character of my name");

        String empty;
        // You can't print a non-iniialized variable. This will throw an error
        // Non-initialized means that the variable has not been assigned a value

        empty = null;
        // You can print a null variable. This will print null as text
        System.out.println(empty);
    }
}
