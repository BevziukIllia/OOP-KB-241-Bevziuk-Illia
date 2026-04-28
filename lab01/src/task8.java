import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int kolvo = 0;
        while (num != 0) {
            sum = sum + num;
            kolvo++;
            num = sc.nextInt();
        }
        int srednee = sum / kolvo;
        System.out.println(srednee);
    }
}