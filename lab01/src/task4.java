import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner aaa = new Scanner(System.in);

        int kolvo = aaa.nextInt();
        aaa.nextLine();

        if (kolvo < 0) {
            System.out.println("negative num");
        } else if (kolvo == 0) {
            System.out.println("No one is here(");
        } else {
            for (int i = 0; i < kolvo; i++) {
                String name = aaa.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}