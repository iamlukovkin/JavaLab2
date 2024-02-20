public class MatrixOperations {
    public static double[] getSumElementsBetweenPositives(double[][] matrix) {
        double[] summaries = new double[matrix.length];
        for (int i = 0; i < matrix.length; i ++) {
            summaries[i] = getSumInRow(matrix[i]);
        }
        return summaries;
    }

    private static double getSumInRow(double[] row) {
        double sum = 0;
        int firstIndex = findPositiveIndex(row, 0);
        int secondIndex = findPositiveIndex(row, firstIndex + 1);
        System.out.println(firstIndex + " " + secondIndex);
        if (firstIndex != -1 && secondIndex != -1) {
            for (int j = firstIndex + 1; j < secondIndex; j++) {
                sum += row[j];
            }
        }
        return sum;
    }

    private static int findPositiveIndex(double[] array, int startIndex) {
        int result = -1;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return result;
    }
}
