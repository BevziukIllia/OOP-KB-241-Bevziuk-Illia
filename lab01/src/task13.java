import java.util.Arrays;
public class task13 {
    public static int[] removeLocalMaxima(int[] mas) {
        int[] temp = new int[mas.length];
        int k = 0;
        for (int i = 0; i < mas.length; i++) {
            boolean localMax = false;
            if (i == 0) {
                if (mas[i] > mas[i + 1]) {
                    localMax = true;
                }
            } else if (i == mas.length - 1) {
                if (mas[i] > mas[i - 1]) {
                    localMax = true;
                }
            } else {
                if (mas[i] > mas[i - 1] && mas[i] > mas[i + 1]) {
                    localMax = true;
                }
            }
            if (!localMax) {
                temp[k] = mas[i];
                k++;
            }
        }
        return Arrays.copyOf(temp, k);
    }
    public static void main(String[] args) {
        int[] nums = {18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(nums)));
    }
}