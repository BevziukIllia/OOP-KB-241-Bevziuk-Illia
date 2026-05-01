public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (area() == 0) {
            throw new IllegalArgumentException("Quadrilateral is degenerate");
        }
    }

    private Point[] getPoints() {
        return new Point[]{a, b, c, d};
    }

    private double getSignedDoubleArea() {
        Point[] points = getPoints();
        double sum = 0;
        for (int i = 0; i < points.length; i++) {
            Point first = points[i];
            Point second = points[(i + 1) % points.length];
            sum = sum + first.getX() * second.getY() - second.getX() * first.getY();
        }

        return sum;
    }

    public double area() {
        return Math.abs(getSignedDoubleArea()) / 2;
    }

    public Point centroid() {
        Point[] points = getPoints();
        double sum = 0;
        double xSum = 0;
        double ySum = 0;

        for (int i = 0; i < points.length; i++) {
            Point first = points[i];
            Point second = points[(i + 1) % points.length];
            double cross = first.getX() * second.getY() - second.getX() * first.getY();
            sum = sum + cross;
            xSum = xSum + (first.getX() + second.getX()) * cross;
            ySum = ySum + (first.getY() + second.getY()) * cross;
        }
        double x = xSum / (3 * sum);
        double y = ySum / (3 * sum);
        return new Point(x, y);
    }
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}