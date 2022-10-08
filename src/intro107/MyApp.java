package intro107;

public class MyApp {
    
    public static void main(String[] args) {
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        double m = Math.random() * 10 + 1;
        double n = Math.random() * 10 + 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("m = " + m);
        System.out.println("n = " + n);


        System.out.println("add a+b= "+MyMathLibrary.add(a, b));
        System.out.println("subtract a-b="+MyMathLibrary.subtract(a, b));
        System.out.println("multiply a*b= "+MyMathLibrary.multiply(a, b));
        System.out.println("divide a/b= "+MyMathLibrary.divide(a, b));
        System.out.println("remainder a%b= "+MyMathLibrary.remainder(a, b));
        System.out.println("squareRoot sqrt(a)= "+MyMathLibrary.squareRoot(a));
        System.out.println("square n*n= "+MyMathLibrary.square(n));
        System.out.println("power m^n= "+MyMathLibrary.power(m, n));

        // square root of 5+3 times 6+2
        System.out.println(MyMathLibrary.squareRoot(MyMathLibrary.add(5, 3) * MyMathLibrary.add(6, 2)));
    }
}
