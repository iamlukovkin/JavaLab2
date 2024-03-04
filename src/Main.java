import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> array = Input.getLongArray("Введите элементы массива: ");
        ArrayList<Long> sortedArray = ArrayOperations.BubbleSortByLength(array);
        System.out.println("Отсортированный массив: ");
        Output.printArray(sortedArray);
        System.out.println("Массив в обратном порядке: ");
        Output.printReversedArray(sortedArray);
        DevelopInfo.display("Анна Абакумова");

        double kValue = Input.getDouble("Введите значение k");
        double nValue = Input.getDouble("Введите значение n");
        double mValue = Input.getDouble("Введите значение m");
        ValueOperations.showExistence(kValue, mValue, nValue);
        DevelopInfo.display("Софья Попова");

        double[][] matrix = Input.getDoubleMatrix();
        double[] sumElementsBetweenPositives = MatrixOperations.getSumElementsBetweenPositives(matrix);
        System.out.println("Сумма элементов между положительными элементами каждой строки: ");
        Output.printArray(sumElementsBetweenPositives);
        Input.getScanner().close();
        DevelopInfo.display("Софья Попова");
    }
}