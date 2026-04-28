import java.util.Arrays;
public class task12 {
    public static boolean[] getSumCheckArray(int[] arr) {
        boolean[] otvet = new boolean[arr.length];
        otvet[0] = false;
        otvet[1] = false;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + arr[i - 2]) {
                otvet[i] = true;
            } else {
                otvet[i] = false;
            }
        }
        return otvet;
    }
    public static void main(String[] args) {
        int[] nums = {1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println(Arrays.toString(getSumCheckArray(nums)));
    }
}