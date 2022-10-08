package intro107;

/**
 * 
 */
public class MyMathLibrary {
    
    // Write a method that takes two doubles as parameters and adds those two doubles
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Write a method that takes two doubles as parameters and subtracts those two doubles
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Write a method that takes two doubles as parameters and multiplies those two doubles
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Write a method that takes two doubles as parameters and divides those two doubles
    public static double divide(double a, double b) {
        return a / b;
    }

    // Write a method that takes two doubles as parameters and returns the remainder of the division of those two doubles
    public static double remainder(double a, double b) {
        return a % b;
    }

    // Write a method that takes one double and returns the square root of that double
    public static double squareRoot(double a) {
        return Math.sqrt(a);
    }

    // Write a method that takes one double and returns the squared value of that double
    public static double square(double a) {
        return a * a;
    }

    // Write a method that takes two double values and muliplies the first value n number of times with itself
    // The second value is the number of times the first value is multiplied with itself
    public static double power(double a, double b) {
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
