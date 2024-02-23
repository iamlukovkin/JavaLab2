import java.util.Scanner;

public class Input {
    private static Scanner scanner;
    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner.reset();
    }

    public static String getString(String message) {
        System.out.println(message);
        return getScanner().nextLine();
    }

    public static String getString() {
        return getScanner().nextLine();
    }

    public static int getInt(String message) {
        System.out.println(message);
        return Integer.parseInt(getScanner().nextLine());
    }

    public static double getDouble(String message) {
        System.out.println(message);
        return Double.parseDouble(getScanner().nextLine());
    }

    public static String[] getStringArray(String message) {
        return getString(message).split(" ");
    }
    public static String[] getStringArray() {
        return getString().split(" ");
    }

    public static String[] getStringArray(int size) {
        String[] line = new String[size];
        boolean lineIsCorrect = false;
        while (!lineIsCorrect) {
            line = getStringArray();
            if (line.length != size) {
                System.out.println("Неверное количество элементов в строке. Попробуйте ещё раз.");
            } else {
                lineIsCorrect = true;
            }
        }
        return line;
    }


    public static double[][] getDoubleMatrix() {
        int size = getInt("Введите размерность матрицы (n x n): ");
        double[][] result = new double[size][size];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < size; i++) {
            String[] line = getStringArray(size);
            for (int j = 0; j < size; j++) {
                result[i][j] = Double.parseDouble(line[j]);
            }
        }
        return result;
    }
}
