import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3)
        );

        Quadrilateral quadrilateral = new Quadrilateral(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 4),
                new Point(0, 4)
        );

        Circle circle = new Circle(new Point(2, 2), 5);

        System.out.println(triangle);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle centroid: " + triangle.centroid());

        System.out.println();

        System.out.println(quadrilateral);
        System.out.println("Quadrilateral area: " + quadrilateral.area());
        System.out.println("Quadrilateral centroid: " + quadrilateral.centroid());

        System.out.println();

        System.out.println(circle);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle centroid: " + circle.centroid());
    }
}