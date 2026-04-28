import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        int sec = lol.nextInt();
        sec = sec % 86400;
        int hour = sec / 3600;
        int min = (sec % 3600) / 60;
        int sek = sec % 60;
        System.out.printf("%d:%02d:%02d", hour, min, sek);
    }
}