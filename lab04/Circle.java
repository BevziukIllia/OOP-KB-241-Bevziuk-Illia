public class Circle extends Figure {
    private Point center;
    private double radius;
    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle is degenerate");
        }
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public Point centroid() {
        return center;
    }

    public String toString() {
        return "Circle[" + center + " " + radius + "]";
    }
}