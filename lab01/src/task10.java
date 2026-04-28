public class task10 {
    public static int max(int[] mas) {
        int big = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > big) {
                big = mas[i];
            }
        }
        return big;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 3, 9, 1};
        System.out.println(max(nums));
    }
}