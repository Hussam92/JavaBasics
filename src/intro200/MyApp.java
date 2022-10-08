package intro200;

public class MyApp {
    
    public static void main(String[] args) {
        
        // Now we are going to learn some object oriented programming
        // Object oriented programming is a way of programming that uses objects
        // Objects are a way of grouping variables and methods together
        double a = Math.random() * 20;
        double b = Math.random() * 20;

        Rectangle myFirstRectangle = new Rectangle(5.0, 7.0);
        Rectangle mySecondRectangle = new Rectangle(10.0, 12.0);
        Rectangle randomRectangle = new Rectangle(a, b);

        printMyRectangle(myFirstRectangle);
        printMyRectangle(mySecondRectangle);
        printMyRectangle(randomRectangle);

        Circle myFirstCircle = new Circle(3.0);
        Circle mySecondCircle = new Circle(12.666);
        Circle randomCircle = new Circle(a);

        printMyCircle(myFirstCircle);
        printMyCircle(mySecondCircle);
        printMyCircle(randomCircle);

        Triangle myFirstTriangle = new Triangle(5.0, 3.5, 2.0);
        Triangle mySecondTriangle = new Triangle(10.0, 12.0, 13.0);
        double diff = Math.abs(a - b);
        double c = a + b - diff;
        Triangle randomTriangle = new Triangle(a, b, c);

        printMyTriangle(myFirstTriangle);
        printMyTriangle(mySecondTriangle);
        printMyTriangle(randomTriangle);
    }

    public static void printMyRectangle(Rectangle rectangle) {
        System.out.println("\n- - - - - - - ");
        System.out.println("The length of the rectangle is " + rectangle.getLength());
        System.out.println("The width of the rectangle is " + rectangle.getWidth());
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println(rectangle);
        System.out.println("- - - - - - - \n");
    }

    public static void printMyCircle(Circle circle) {
        System.out.println("\n- - - - - - - ");
        System.out.println("The radius of the circle is " + circle.getRadius());
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
        System.out.println(circle);
        System.out.println("- - - - - - - \n");
    }

    public static void printMyTriangle(Triangle triangle) {
        System.out.println("\n- - - - - - - ");
        System.out.println("The side a of the triangle is " + triangle.getA());
        System.out.println("The side b of the triangle is " + triangle.getB());
        System.out.println("The side c of the triangle is " + triangle.getC());
        System.out.println("The area of the triangle is " + triangle.getArea());
        System.out.println("The perimeter of the triangle is " + triangle.getPerimeter());
        System.out.println(triangle);
        System.out.println("- - - - - - - \n");
    }
}
