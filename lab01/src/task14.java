import java.util.Arrays;
public class task14 {
    public static void cycleSwap(int[] array) {
        cycleSwap(array, 1);
    }
    public static void cycleSwap(int[] array, int shift) {
        if (array.length == 0 || shift == 0) {
            return;
        }
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newPlace = (i + shift) % array.length;
            copy[newPlace] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = copy[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7, 4};

        cycleSwap(nums, 3);

        System.out.println(Arrays.toString(nums));
    }
}