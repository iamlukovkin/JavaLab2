
public class ValueOperations {
    private static boolean[] checkExistence(double k, double m, double n) {
        boolean[] result = new boolean[4];
        result[0] = (n < k) && (k <= m);
        result[1] = (n <= k) && (k < m);
        result[2] = (n < k) && (k < m);
        result[3] = (n <= k) && (k <= m);
        return result;
    }

    public static void showExistence(double k, double m, double n) {
        boolean[] result = checkExistence(k, m, n);
        String[] intervals = new String[] {"(n, m]", "[n, m)", "(n, m)", "[n, m]"};
        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                System.out.println("Значение " + k + " принадлежит интервалу " + intervals[i]);
            } else {
                System.out.println("Значение " + k + " не принадлежит интервалу " + intervals[i]);
            }
        }
    }
}
