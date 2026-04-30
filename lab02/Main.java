import java.util.Scanner;
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
class Line {
    double k;
    double b;
    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line otherLine) {
        if (this.k == otherLine.k) {
            return null;
        }
        double x = (otherLine.b - this.b) / (this.k - otherLine.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double k2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        Line line1 = new Line(k1, b1);
        Line line2 = new Line(k2, b2);
        System.out.println(line1.intersection(line2));
    }
}