import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // сколько поднимается за день
        int b = sc.nextInt(); // сколько сползает ночью
        int h = sc.nextInt(); // высота дерева
        int day = 0;
        int now = 0;
        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            while (now < h) {
                day++;
                now = now + a;
                if (now >= h) {
                    break;
                }
                now = now - b;
            }
            System.out.println(day);
        }
    }
}