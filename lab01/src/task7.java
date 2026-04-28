import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num;
        while (num != 0) {
            if (num > max) {
                max = num;
            }
            num = sc.nextInt();
        }
        System.out.println(max);
    }
}