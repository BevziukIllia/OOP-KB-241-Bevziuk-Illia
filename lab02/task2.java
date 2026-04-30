class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}
class Segment {
    Point start;
    Point end;
    public Segment(Point start, Point end) {
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Segment is degenerate");
        }
        this.start = start;
        this.end = end;
    }
    public double length() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public Point middle() {
        double middleX = (start.x + end.x) / 2;
        double middleY = (start.y + end.y) / 2;
        return new Point(middleX, middleY);
    }
    public Point intersection(Segment another) {
        double x1 = this.start.x;
        double y1 = this.start.y;
        double x2 = this.end.x;
        double y2 = this.end.y;
        double x3 = another.start.x;
        double y3 = another.start.y;
        double x4 = another.end.x;
        double y4 = another.end.y;
        double down = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (down == 0) {
            return null;
        }
        double upX = (x1 * y2 - y1 * x2) * (x3 - x4)
                - (x1 - x2) * (x3 * y4 - y3 * x4);
        double upY = (x1 * y2 - y1 * x2) * (y3 - y4)
                - (y1 - y2) * (x3 * y4 - y3 * x4);
        double x = upX / down;
        double y = upY / down;

        if (isInside(x, y, this) && isInside(x, y, another)) {
            return new Point(x, y);
        }
        return null;
    }
    private boolean isInside(double x, double y, Segment s) {
        double minX = Math.min(s.start.x, s.end.x);
        double maxX = Math.max(s.start.x, s.end.x);
        double minY = Math.min(s.start.y, s.end.y);
        double maxY = Math.max(s.start.y, s.end.y);

        return x >= minX && x <= maxX && y >= minY && y <= maxY;
    }
}
public class task2 {
    public static void main(String[] args) {
        Segment s1 = new Segment(new Point(0, 0), new Point(4, 4));
        Segment s2 = new Segment(new Point(0, 4), new Point(4, 0));

        System.out.println(s1.length());
        System.out.println(s1.middle());
        System.out.println(s1.intersection(s2));
    }
}