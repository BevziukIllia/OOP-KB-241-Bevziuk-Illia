public class task11 {
    public static int sum(int[] mas) {
        if (mas == null || mas.length == 0) {
            return 0;
        }
        int otvet = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                otvet = otvet + mas[i];
            }
        }
        return otvet;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(nums));
    }
}