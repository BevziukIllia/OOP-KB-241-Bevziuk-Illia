public class Triangle extends Figure {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        double square = getTriangleArea(a, b, c);

        if (square == 0) {
            throw new IllegalArgumentException("Triangle is degenerate");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getTriangleArea(Point p1, Point p2, Point p3) {
        double result = Math.abs(
                p1.getX() * (p2.getY() - p3.getY()) +
                        p2.getX() * (p3.getY() - p1.getY()) +
                        p3.getX() * (p1.getY() - p2.getY())
        ) / 2;

        return result;
    }

    public double area() {
        return getTriangleArea(a, b, c);
    }

    public Point centroid() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;

        return new Point(x, y);
    }

    public String toString() {
        return "Triangle[A" + a + " B" + b + " C" + c + "]";
    }
}