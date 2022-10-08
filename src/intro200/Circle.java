package intro200;

public class Circle {

    // The radius of the circle
    private double radius;

    /**
     * Create a new circle with the given radius
     * 
     * @param radius The radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Get the radius of the circle
     * 
     * @return The radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Get the area of the circle
     * 
     * @return The area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Get the circumference of the circle
     * 
     * @return The circumference of the circle
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Get the string representation of the circle
     * 
     * @return The string representation of the circle
     */
    public String toString() {
        return "Circle with radius " + radius;
    }
}
