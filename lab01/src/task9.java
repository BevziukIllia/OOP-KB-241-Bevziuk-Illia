import java.util.Scanner;
import java.text.DecimalFormat;
public class task9 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        double a = abc.nextDouble();
        double b = abc.nextDouble();
        double c = abc.nextDouble();
        double d = b * b - 4 * a * c;
        DecimalFormat fff = new DecimalFormat("#.##########");
        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println(fff.format(x));
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            System.out.println(fff.format(x1) + " " + fff.format(x2));
        }
    }
}