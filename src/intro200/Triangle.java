package intro200;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (! this.checkValidity()) {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            throw new IllegalArgumentException("The triangle is not valid");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    /**
     * Get the area of the triangle
     * @return The area of the triangle
     */
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Get the perimeter of the triangle
     * @return The perimeter of the triangle
     */
    public double getPerimeter() {
        return a+b+c;
    }

    private boolean checkValidity()
    {
    // check condition
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;

        }
        
        return true;
    }
}
