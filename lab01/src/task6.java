import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        double summa = lol.nextDouble();
        int friends = lol.nextInt();
        if (summa < 0) {
            System.out.println("Negative bill");
        } else if (friends == 0) {
            System.out.println("No friends");
        } else {
            double allSumma = summa + summa * 0.10;
            double part = allSumma / friends;
            if (part == (int) part) {
                System.out.println((int) part);
            } else {
                System.out.println(part);
            }
        }
    }
}