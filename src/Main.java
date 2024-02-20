public class Main {
    public static void main(String[] args) {
        String[] array = Input.getStringArray("Введите элементы массива");
        String[] sortedArray = ArrayOperations.BubbleSortByLength(array);
        System.out.println("Отсортированный массив: ");
        Output.printArray(sortedArray);
        System.out.println("Массив в обратном порядке: ");
        Output.printReversedArray(sortedArray);

        double kValue = Input.getDouble("Введите значение k");
        double nValue = Input.getDouble("Введите значение n");
        double mValue = Input.getDouble("Введите значение m");
        ValueOperations.showExistence(kValue, mValue, nValue);

        double[][] matrix = Input.getDoubleMatrix();
        double[] sumElementsBetweenPositives = MatrixOperations.getSumElementsBetweenPositives(matrix);
        System.out.println("Сумма элементов между положительными элементами каждой строки: ");
        Output.printArray(sumElementsBetweenPositives);
    }
}