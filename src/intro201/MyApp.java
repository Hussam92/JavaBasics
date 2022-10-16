package intro201;

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

        // printMyRectangle(myFirstRectangle);
        // printMyRectangle(mySecondRectangle);
        // printMyRectangle(randomRectangle);

        Circle myFirstCircle = new Circle(3.0);
        Circle mySecondCircle = new Circle(12.666);
        Circle randomCircle = new Circle(a);

        // printMyCircle(myFirstCircle);
        // printMyCircle(mySecondCircle);
        // printMyCircle(randomCircle);

        Triangle myFirstTriangle = new Triangle(5.0, 3.5, 2.0);
        Triangle mySecondTriangle = new Triangle(10.0, 12.0, 13.0);
        double diff = Math.abs(a - b);
        double c = a + b - diff;
        Triangle randomTriangle = new Triangle(a, b, c);

        // printMyTriangle(myFirstTriangle);
        // printMyTriangle(mySecondTriangle);
        // printMyTriangle(randomTriangle);

        // Now we are going to learn about polymorphism
        // Polymorphism is the ability to treat objects of different types in the same
        // way

        Rectangle[] allRectangles = { myFirstRectangle, mySecondRectangle, randomRectangle };
        System.out.println("There are " + allRectangles.length + " rectangles in the array");
        for (Rectangle rectangleFromList : allRectangles) {
            printMyRectangle(rectangleFromList);
        }

        Circle[] allCircles = { myFirstCircle, mySecondCircle, randomCircle };
        System.out.println("There are " + allCircles.length + " circles in the array");
        for (Circle circleFromList : allCircles) {
            printMyCircle(circleFromList);
        }

        Triangle[] allTriangles = { myFirstTriangle, mySecondTriangle, randomTriangle };
        System.out.println("There are " + allTriangles.length + " triangles in the array");
        for (Triangle triangle : allTriangles) {
            printMyTriangle(triangle);
        }

        Shape[] allShape = {
                myFirstRectangle,
                mySecondTriangle,
                randomCircle,
                randomRectangle,
                mySecondCircle,
                myFirstTriangle,
                myFirstCircle,
                randomTriangle,
                mySecondRectangle,
                new Square(3.0),
                new Octagon(8.0)
        };

        double sumOfAllAreas = 0;
        double sumOfAllPerimeters = 0;

        for (Shape shape : allShape) {
            double perimeter = shape.getPerimeter();
            double area = shape.getArea();
            
            sumOfAllAreas += area;
            sumOfAllPerimeters += perimeter;

            System.out.println("The area of the shape is " + area);
            System.out.println("The perimeter of the shape is " + perimeter);

            System.out.println("This shape is a " + shape.getClass().getSimpleName());
        }

        System.out.println("The sum of all areas is " + sumOfAllAreas);
        System.out.println("The sum of all perimeters is " + sumOfAllPerimeters);
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
        System.out.println("The circumference of the circle is " + circle.getPerimeter());
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
