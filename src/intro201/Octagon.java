package intro201;

public class Octagon implements Shape {
    
    double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * side * side;
    }

    public double getPerimeter() {
        return 8 * side;
    }
}
