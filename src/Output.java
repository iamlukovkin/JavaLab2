import java.util.ArrayList;

public class Output {
    public static void printArray(ArrayList<Long> array) {
        for (Long s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printReversedArray(ArrayList<Long> array) {
        array.reversed();
        for (Long s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
