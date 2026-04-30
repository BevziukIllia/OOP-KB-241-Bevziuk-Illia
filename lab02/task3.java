class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    private String goodNumber(double num) {
        if (Math.abs(num - Math.round(num)) < 0.000001) {
            return "" + Math.round(num);
        }
        return "" + num;
    }
    public String toString() {
        return "(" + goodNumber(x) + ";" + goodNumber(y) + ")";
    }
}
class Triangle {
    Point a;
    Point b;
    Point c;
    public Triangle(Point a, Point b, Point c) {
        if (isBadTriangle(a, b, c)) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private boolean isBadTriangle(Point a, Point b, Point c) {
        double square = Math.abs(
                a.x * (b.y - c.y) +
                        b.x * (c.y - a.y) +
                        c.x * (a.y - b.y)
        ) / 2;
        return square == 0;
    }
    public double area() {
        double square = Math.abs(
                a.x * (b.y - c.y) +
                        b.x * (c.y - a.y) +
                        c.x * (a.y - b.y)
        ) / 2;
        return square;
    }
    public Point centroid() {
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;

        return new Point(x, y);
    }
}
public class task3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3)
        );
        System.out.println(triangle.area());
        System.out.println(triangle.centroid());
    }
}