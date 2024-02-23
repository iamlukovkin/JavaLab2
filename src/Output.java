public class Output {
    public static void printArray(String[] array) {
        for (String s : array) {
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

    public static void printReversedArray(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
