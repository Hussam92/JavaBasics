package intro201;

/**
 * A rectangle is a geometric shape that has 4 sides, 4 rectangle angles (90 degree angles)
 * The opposite sides are always the same length
 */
public class Rectangle implements Shape {

    // The length of the rectangle
    private double length;

    // The width of the rectangle
    private double width;

    /**
     * Create a new rectangle with the given length and width
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Get the length of the rectangle
     * @return The length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Get the width of the rectangle
     * @return The width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Get the area of the rectangle
     * @return The area of the rectangle
     */
    public double getArea() {
        return length * width;
    }

    /**
     * Get the perimeter of the rectangle
     * @return The perimeter of the rectangle
     */
    public double getPerimeter() {
        return length + width + length + width;
    }

    /**
     * Get the string representation of the rectangle
     * @return The string representation of the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
